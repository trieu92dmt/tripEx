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
            <a href="<c:url value="/home"/>" class="logo-container d-block">
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
                    <c:if test="${currentUser != null}">
                        <img src="${currentUser.avatar}" alt="avt" onclick="toggleMenu()"/>
                    </c:if>
                    <c:if test="${currentUser == null}">
                        <img src="<c:url value="/images/icon.jpg"/>" alt="avt" onclick="toggleMenu()"/>
                    </c:if>
                    <div class="sub-menu-wrap" id="subMenu">
                        <div class="sub-menu">
                            <c:if test="${currentUser == null}">
                                <a href="<c:url value="/login"/>" class="sub-menu-link">
                                    <i class="fa-solid fa-right-to-bracket"></i>
                                    <p>Đăng nhập</p>
                                    <i class="fa-solid fa-angle-right"></i>
                                </a>
                            </c:if>
                            <c:if test="${currentUser != null}">
                                <c:if test="${currentUser.roleId.roleName.equals('ROLE_CUSTOMER')}">
                                    <div class="user-info">
                                        <img src="${currentUser.avatar}" alt="alt"/>
                                        <h4>${currentUser.customer.fullName}</h4>
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
                                </c:if>
                                <c:if test="${currentUser.roleId.roleName.equals('ROLE_COMPANY')}">
                                    <div class="user-info">
                                        <img src="${currentUser.avatar}" alt="alt"/>
                                        <h4>${currentUser.company.companyName}</h4>
                                    </div>
                                    <hr>

                                    <a href="" class="sub-menu-link">
                                        <i class="fa-regular fa-user"></i>
                                        <p>Quản lý nhà xe</p>
                                        <i class="fa-solid fa-angle-right"></i>
                                    </a>
                                    <a href="" class="sub-menu-link">
                                        <i class="fa-solid fa-gear"></i>
                                        <p>Cài đặt</p>
                                        <i class="fa-solid fa-angle-right"></i>
                                    </a>
                                </c:if>
                                <hr>
                                <a href="<c:url value="/logout"/>" class="sub-menu-link">
                                    <i class="fa-solid fa-right-from-bracket"></i>
                                    <p>Đăng xuất</p>
                                    <i class="fa-solid fa-angle-right"></i>
                                </a>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>