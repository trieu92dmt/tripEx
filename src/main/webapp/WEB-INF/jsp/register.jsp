<%-- 
    Document   : register
    Created on : Sep 25, 2022, 9:51:19 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="/register" var="register"/>
<div class="container-fluid p-0">
    <div class="row register-wrap">
        <div class="col-6 p-0 l-content">
            <img class="w-100" src="<c:url value="/images/benxe3.webp"/>" alt=""/>
        </div>
        <div class="col-6 p-0 d-flex r-content">
            <div class="login-form w-50 m-auto">
                <form:form class="mb-2" enctype="multipart/form-data"
                           action="${register}" method="post" modelAttribute="customer">
                    <label class="text-center d-block color-blue fs-4 mb-3">Đăng Ký</label>
                    <div class="mb-3">
                        <label for="username" class="form-label">Tên đăng nhập: </label>
                        <form:input type="text" class="form-control" id="username" placeholder="Tên đăng nhập" path="user.username"/>
                    </div>
                    <div class="mb-3">
                        <label for="fullname" class="form-label">Họ và tên: </label>
                        <form:input type="text" class="form-control" id="fullname" placeholder="Họ và tên" path="customer.fullName"/>
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">Mật khẩu: </label>
                        <form:input type="password" class="form-control" id="pwd" placeholder="Mật khẩu" path="user.password"/>
                    </div>
                    <div class="mb-3">
                        <label for="confirm-pwd" class="form-label">Nhập lại mật khẩu: </label>
                        <form:input type="password" class="form-control" id="confirm-pwd" placeholder="Xác nhận mật khẩu" path="user.confirmPassword"/>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email: </label>
                        <form:input type="email" class="form-control" id="email" placeholder="Email" path="user.email"/>
                    </div>
                    <div class="mb-3">
                        <label for="phone-number" class="form-label">Số điện thoại: </label>
                        <form:input type="number" class="form-control" id="phone-number" placeholder="Số điện thoại" path="user.phoneNumber"/>
                    </div>
                    <div class="mb-3">
                        <label for="avatar" class="form-label">Avatar </label>
                        <form:input type="file" class="form-control" id="avatar" placeholder="Số điện thoại" path="user.file"/>
                    </div>
                    <button type="submit" class="btn btn-primary d-block mx-auto">Đăng ký</button>
                </form:form>
                <span>Đã có tài khoản?</span>
                <a class="std-link fw-bold" href="<c:url value="/login"/>">Đăng nhập</a>
            </div>
        </div>
    </div>
</div>