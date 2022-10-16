<%-- 
    Document   : frequency-stat
    Created on : Oct 15, 2022, 5:32:48 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container my-3">
    <div class="row company-manager">
        <div class="col-3 left-layout">
            <ul class="nav-links menu">
                <li>
                    <a href="<c:url value="/company/manager/details"/>" class="menu-link active">
                        <i class="fa-regular fa-user"></i>
                        <p>Thông tin nhà xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/company/manager/car"/>" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Quản lý xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/company/manager/trip"/>" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Quản lý chuyến xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Giao hàng</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/company/manager/trip"/>" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Gia hạn gói nhà xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Thống kê doanh thu</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Thống kê tần suất</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
            </ul>
        </div>
        <div class="col-9">
        </div>
    </div>
</div>
