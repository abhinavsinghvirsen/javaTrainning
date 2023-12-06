package com.crud.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class ReqFiltter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {


        logger.info("Abhinav authenticated user  ");
        String host = httpServletRequest.getHeader("Host");
        logger.info("Abhinav authenticated user  "+host);

         if(host.equalsIgnoreCase("12345.567.789:8080")){
return;
         }else {
             filterChain.doFilter(httpServletRequest, httpServletResponse);
         }

    }
}
