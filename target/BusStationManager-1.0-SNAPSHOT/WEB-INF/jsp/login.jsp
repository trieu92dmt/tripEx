<%-- 
    Document   : login
    Created on : Sep 25, 2022, 7:30:45 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container-fluid p-0">
    <div class="row login-content">
        <div class="col-6 p-0 l-content">
            <img class="w-100" src="<c:url value="/images/benxe.webp"/>" alt=""/>
        </div>
        <div class="col-6 p-0 d-flex login-form-wrap r-content">
            <div class="login-form w-50 m-auto">
                <form class="mb-2" action="<c:url value="/user-login"/>" method="post">
                    <label class="text-center d-block color-blue fs-4">Đăng Nhập</label>
                    <div class="mb-3 mt-3">
                        <label for="username" class="form-label">Tên đăng nhập: </label>
                        <input type="text" class="form-control" id="username" placeholder="Tên đăng nhập" name="username">
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">Mật khẩu: </label>
                        <input type="password" class="form-control" id="pwd" placeholder="Mật khẩu" name="password">
                    </div>
                    <!--                    <div class="form-check mb-3 d-flex justify-content-between">
                                            <label class="form-check-label">
                                                <input class="form-check-input" type="checkbox" name="remember"> Nhớ mật khẩu
                                            </label>
                                            <a class="std-link fw-bold" href="">Quên mật khẩu?</a>
                                        </div>-->
                    <button class="cus-button fw-bold d-block mx-auto" role="button" type="submit">Đăng Nhập</button>
                </form>
                <span>Chưa có tài khoản?</span>
                <a class="std-link fw-bold" href="<c:url value="/register"/>">Đăng Kí</a>
            </div>
        </div>
    </div>
</div>