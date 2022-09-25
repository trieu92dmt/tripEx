<%--
    Document   : header
    Created on : Aug 3, 2022, 6:28:35 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header-container">
    <div class="header-content d-flex">
        <div class="l-header">
            <a href="#" class="logo-container d-block">
                <img src="<c:url value="/images/logo1.jpg"/>" alt="logo"/>
            </a>
        </div>
        <div class="r-header d-flex align-items-center">
            <div class="r-header-items d-flex align-items-center">
                <div class="nav-link-items d-flex">
                    <div class="companys">
                        <a class="text-decoration-none fw-bold" href="#">Danh sách nhà xe</a>
                    </div>
                    <div class="stations">
                        <a class="text-decoration-none fw-bold" href="#">Danh sách bến xe</a>
                    </div>
                </div>
                <div class="lang lang-btn">
                    <span>EN</span>
                    <i class="fa-solid fa-language"></i>
                </div>
                <div class="avatar">
                    <div class="avt-container w-100 m-0 p-0">
                        <img src="<c:url value="/images/icon.jpg"/>" alt="avt" onclick="toggleMenu()"/>
                    </div>
                    <div class="sub-menu-wrap" id="subMenu">
                        <div class="sub-menu">
                            <div class="user-info">
                                <img src="<c:url value="/images/icon.jpg"/>" alt="alt"/>
                                <h4>Minh Triều</h4>
                            </div>
                            <hr>

                            <a href="" class="sub-menu-link">
                                <i class="fa-regular fa-user"></i>
                                <p>Thông tin tài khoản</p>
                                <i class="fa-solid fa-angle-right"></i>
                            </a>
                            <a href="" class="sub-menu-link">
                                <i class="fa-solid fa-gear"></i>
                                <p>Cài đặt</p>
                                <i class="fa-solid fa-angle-right"></i>
                            </a>
                            <hr>
                            <a href="" class="sub-menu-link">
                                <i class="fa-solid fa-right-from-bracket"></i>
                                <p>Đăng xuất</p>
                                <i class="fa-solid fa-angle-right"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>