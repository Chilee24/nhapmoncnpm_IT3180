package com.hust.seller.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;


public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

   @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        // Lấy tên người dùng từ authentication
        String role = authentication.getAuthorities().stream()
                .findFirst() // Giả định rằng người dùng có một vai trò
                .map(grantedAuthority -> grantedAuthority.getAuthority())
                .orElse("");

        // Điều hướng theo vai trò
        if (role.equals("ROLE_ADMIN")) {
            response.sendRedirect("/admin/home"); // Đường dẫn cho admin
        } else if (role.equals("ROLE_SELLER")) {
            response.sendRedirect("/seller/home"); // Đường dẫn cho seller
        } else if (role.equals("ROLE_CUSTOMER")) {
            response.sendRedirect("/customer/home"); // Đường dẫn cho customer
        } else {
            response.sendRedirect("/login?error=true"); // Đường dẫn mặc định nếu không xác định được vai trò
        }
    }
}
