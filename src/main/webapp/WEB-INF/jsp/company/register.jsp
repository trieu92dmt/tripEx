<%-- 
    Document   : register
    Created on : Sep 25, 2022, 11:25:07 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="/company/register" var="carCompanyRegister"/>
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
                    <button class="cus-button fw-bold d-block mx-auto package-chose-btn" 
                            data-package-id="${p.packageId}" 
                            data-package-name="${p.packageName}"
                            data-package-expired="${p.expiredDate}"
                            data-package-limit="${p.carLimit}"
                            data-package-price="${p.price}"
                            role="button" type="submit">Đăng Ký</button>
                </div>
            </div>
        </c:forEach>    
    </ul>
    <div class="company-register" id="company-register">
        <label class="register-form-title d-flex justify-content-center fs-4 fw-bold">Nhập Thông Tin Đăng Ký Nhà Xe</label>
        <form:form class="row company-register-form" action="${carCompanyRegister}" method="post" enctype="multipart/form-data" modelAttribute="companyRegister">
            <div class="col-4 px-4">
                <div class="company-info-form">
                    <label class="d-block text-center fw-bold fs-4 pb-3">Thông tin nhà xe</label>
                    <label>Tên nhà xe: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input id="companyName" type="text" class="form-control" placeholder="Tên nhà xe" path="company.companyName"/>
                        <label for="companyName">Tên nhà xe</label>
                    </div>
                    <label>Địa chỉ: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input id="address" type="text" class="form-control" placeholder="Địa chỉ" path="company.address"/>
                        <label for="address">Địa chỉ</label>
                    </div>
                    <label>Email: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input id="email" type="email" class="form-control" placeholder="Email" path="company.email"/>
                        <label for="email">Email</label>
                    </div>
                    <label>Số điện thoại: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input id="phoneNumber" type="text" class="form-control" placeholder="Số điện thoại" path="company.phoneNumber"/>
                        <label for="phoneNumber">Số điện thoại</label>
                    </div>
                </div>
            </div>
            <div class="col-4 px-4">
                <div class="company-account">
                    <label class="d-block text-center fw-bold fs-4 pb-3">Thông tin tài khoản</label>
                    <label>Tên đăng nhập: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input type="text" class="form-control" id="username" placeholder="Tên đăng nhập" path="user.username"/>
                        <label for="username">Tên đăng nhập</label>
                    </div>
                    <label>Mật khẩu: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input type="password" class="form-control" id="password" placeholder="Mật khẩu" path="user.password"/>
                        <label for="password">Mật khẩu</label>
                    </div>
                    <label>Xác Nhận Mật khẩu: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input type="password" class="form-control" id="confirmPassword" placeholder="Nhập lại mật khẩu" path="user.confirmPassword"/>
                        <label for="confirmPassword">Nhập lại mật khẩu</label>
                    </div>
                    <label>Email: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input type="email" class="form-control" id="email" placeholder="Email" path="user.email"/>
                        <label for="email">Email</label>
                    </div>
                    <label>Số điện thoại: </label>
                    <div class="form-floating mb-3 mt-2">
                        <form:input type="number" class="form-control" id="phoneNumber" placeholder="Số điện thoại" path="user.phoneNumber"/>
                        <label for="phoneNumber">Số điện thoại</label>
                    </div>
                    <div class="mb-3">
                        <label for="avatar" class="form-label">Avatar </label>
                        <form:input type="file" class="form-control" id="avatar" placeholder="Số điện thoại" path="user.file"/>
                    </div>
                </div>
            </div>
            <div class="col-4 px-4">
                <label class="d-block text-center fw-bold fs-4 pb-3">Gói Nhà Xe</label>
                <div class="package-info">
                    <form:input id="package-id" type="hidden" path="packageId" value=""/>
                    <div class="package-info-item d-flex justify-content-lg-between pb-3">
                        <span>Tên gói: </span>
                        <span id="package-name"></span>
                    </div>
                    <div class="package-info-item d-flex justify-content-lg-between pb-3">
                        <span>Thời hạn: </span>
                        <span id="package-expire"></span>
                    </div>
                    <div class="package-info-item d-flex justify-content-lg-between pb-3">
                        <span>Giới hạn xe: </span>
                        <span id="package-limit"></span>
                    </div>
                    <div class="package-info-item d-flex justify-content-lg-between pb-3">
                        <span>Thành tiền: </span>
                        <span id="package-price"></span>
                    </div>
                </div>
                <hr></hr>
                <button class="cus-button fw-bold d-block mx-auto" role="button" type="submit">Thanh Toán</button>
            </div>
        </form:form>
    </div>
</div>

<script>
    $(".package-chose-btn").click(function () {
    $("#package-id").val($(this).data("package-id"));
    $("#package-name").text($(this).data("package-name"));
    $("#package-expire").text($(this).data("package-expired") + " ngày");
    $("#package-limit").text($(this).data("package-limit") + " xe  ");
    $("#package-price").text(new Intl.NumberFormat('vi-VN', {style: 'currency', currency: 'VND'}).format($(this).data("package-price")));
        $(".company-register").fadeIn();
        $('html, body').animate({
            scrollTop: $(".company-register").offset().top
        });
    })
</script>