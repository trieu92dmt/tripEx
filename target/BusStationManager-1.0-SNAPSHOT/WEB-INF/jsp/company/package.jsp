<%-- 
    Document   : package
    Created on : Oct 15, 2022, 4:42:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container my-3">
    <div class="row company-manager">
        <div class="col-3 left-layout">
            <ul class="nav-links menu">
                <li>
                    <a href="<c:url value="/company/manager/details"/>" class="menu-link">
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
                    <a href="<c:url value="/company/manager/trip"/>" class="menu-link active">
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
        <div class="col-9 mt-4">
            <div class="titile text-center mt-2">
                <span class="fw-bold h2 text-uppercase">Chọn Gói Đăng Ký</span>
            </div>
            <div class="container mt-3">
                <ul class="d-flex justify-content-lg-between p-0">
                    <c:forEach var="p" items="${packages}">
                        <div class="card" style="width:400px">
                            <img class="card-img-top" src="<c:url value="/images/icon.jpg"/>" alt="Card image">
                            <div class="card-body">
                                <h4 class="card-title">${p.packageName}</h4>
                                <p class="card-text">Giới hạn xe: ${p.carLimit} xe</p>
                                <p class="card-text">Thời hạn: ${p.expiredDate} ngày</p>
                                <p class="card-text">Giá: ${p.price} VNĐ</p>
                                <button class="cus-button fw-bold d-block mx-auto package-extend-btn" 
                                        data-package-id="${p.packageId}" 
                                        data-package-name="${p.packageName}"
                                        data-package-expired="${p.expiredDate}"
                                        data-package-limit="${p.carLimit}"
                                        data-package-price="${p.price}"
                                        role="button" type="submit">Gia Hạn</button>
                            </div>
                        </div>
                    </c:forEach>    
                </ul>
            </div>
        </div>
    </div>
</div>
