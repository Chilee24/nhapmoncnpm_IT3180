package com.hust.seller.user;

import com.hust.seller.entity.Role;
import com.hust.seller.entity.User;
import com.hust.seller.security.RoleRepository;
import com.hust.seller.security.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping("/")
@Controller
public class RegistrationController {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public RegistrationController(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(UserDTO userDTO) {
        // Kiểm tra nếu email đã tồn tại

        if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            // Xử lý lỗi nếu email đã tồn tại
            return "emailexsist";

        }

        // Tạo đối tượng User mới
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword())); // Mã hóa mật khẩu
        user.setEmail(userDTO.getEmail());
        user.setFullName(userDTO.getFullName());
        user.setAddress(userDTO.getAddress());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        // Gán vai trò cho người dùng dựa trên lựa chọn
        Role role;
        switch (userDTO.getRole()) {
            case "ROLE_SELLER":
                role = roleRepository.findByRoleName("ROLE_SELLER").orElseThrow();
                break;
            case "ROLE_ADMIN":
                role = roleRepository.findByRoleName("ROLE_ADMIN").orElseThrow();
                break;
            default:
                role = roleRepository.findByRoleName("ROLE_CUSTOMER").orElseThrow();
                break;
        }
        user.setRoles(Set.of(role)); // Gán vai trò cho người dùng

        // Lưu người dùng vào cơ sở dữ liệu
        user.setActive(false);
        userRepository.save(user);

        return "redirect:/login?success"; // Sau khi đăng ký, điều hướng sang trang đăng nhập
    }

}
