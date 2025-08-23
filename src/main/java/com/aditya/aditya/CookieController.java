package com.aditya.aditya;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {

    // ✅ Set a cookie
    @GetMapping("/set-cookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("username", "Aditya");
        cookie.setHttpOnly(true); // prevent JS access (security)
        cookie.setSecure(false);  // set true if using HTTPS
        cookie.setPath("/");      // cookie is available to whole app
        cookie.setMaxAge(60 * 60); // 1 hour

        response.addCookie(cookie);
        return "Cookie 'username' has been set!";
    }

    // ✅ Get cookie
    @GetMapping("/get-cookie")
    public String getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    return "Found cookie: " + c.getValue();
                }
            }
        }

        return "No cookie found!";
    }
}
