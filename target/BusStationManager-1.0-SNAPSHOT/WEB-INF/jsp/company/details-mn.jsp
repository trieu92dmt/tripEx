<%-- 
    Document   : details-mn
    Created on : Oct 3, 2022, 8:01:40 PM
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
                    <a href="" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Quản lý tuyến xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="" class="menu-link">
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
                    <a href="" class="menu-link">
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
            <div class="basic-information">
                <div class="custom-label">
                    <label class="fw-bold px-3 py-2">Thông tin nhà xe</label>
                </div>
                <div class="basic-info mt-3">
                    <div class="basic-info--wrap d-flex justify-content-lg-between">
                        <div class="basic-info-header">
                            <div class="basic-info-header__avatar mb-2">
                                <div class="company-avatar">
                                    <img class="mhy-avatar__img" style="background-image: url('${currentUser.avatar}')"> 
                                </div> <!----> 
                            </div> 
                        </div> 
                        <div class="wrapper">
                            <div class="basic-info-center">
                                <div class="company-name fw-bold">
                                    <span>${currentUser.company.companyName}</span>
                                </div>
                                <div class="main-content-container d-flex justify-content-center">
                                    <div class="l-content p-3">
                                        <div class="address d-flex py-2">
                                            <span class="fw-bold pe-2">Địa chỉ văn phòng: </span>
                                            <span>${currentUser.company.address}</span>
                                        </div>
                                        <div class="email d-flex py-2">
                                            <span class="fw-bold pe-2">Email: </span>
                                            <span>${currentUser.company.email}</span>
                                        </div>
                                    </div>
                                    <div class="r-content p-3">
                                        <div class="phone-number d-flex py-2">
                                            <span class="fw-bold pe-2">Số điện thoại: </span>
                                            <span>${currentUser.company.phoneNumber}</span>
                                        </div>
                                        <div class="rate-avg d-flex py-2">
                                            <span class="fw-bold pe-2">Đánh giá: </span>
                                            <span>5.0 sao</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="basic-info-header__buttons"><!----> 
                                    <div class="qlbx-btn-link">
                                        <button class="cus-button fw-bold d-block mx-auto" role="button" type="button" data-bs-toggle="modal" data-bs-target="#editInfo">Chỉnh Sửa</button>
                                    </div>
                                </div>
                            </div> 
                            <div class="company-info-usage">
                                <div class="company-info-usage-title fw-bold">
                                    <span>Thông sử dụng nhà xe</span>
                                </div>
                                <div class="main-content-container d-flex justify-content-center">
                                    <div class="l-content p-3">
                                        <div class="phone-number d-flex py-2">
                                            <span class="fw-bold pe-2">Hết gọi gói đăng ký: </span>
                                            <span>${currentUser.company.expiredDate}</span>
                                        </div>
                                    </div>
                                    <div class="r-content p-3">
                                        <div class="address d-flex py-2">
                                            <span class="fw-bold pe-2">Giới hạn xe: </span>
                                            <span>${currentUser.company.carLimit}</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="editInfo">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Chỉnh sửa thông tin cơ bản</h4>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <c:url value="/company/details/update" var="updateCompany"/>
            <!-- Modal body -->
            <div class="modal-body">
                <form:form action="${updateCompany}" method="post" modelAttribute="company">
                    <div class="form-edit-container row">
                        <div class="avt-edit-container col-6 text-center">
                            <div class="basic-info-header__avatar mb-2">
                                <div class="company-avatar">
                                    <img class="mhy-avatar__img" id="image-preview" style="background-image: url('${currentUser.avatar}')"> 
                                </div> <!----> 
                            </div> 
                            <div class="basic-info-header__buttons"><!----> 
                                <!--<input type="file" id="upload-img" name="file" class="d-none"/>-->
                                <label class="fw-bold d-block mx-auto" id="upload-avt-btn" for="upload-img">
                                    Chỉnh sửa
                                </label>
                            </div>
                        </div> 
                        <div class="info-edit-container col-6">
                            <div class="form-floating mb-2">
                                <form:input class="form-control" id="company-name" type="text" placeholder="Tên nhà xe" value="${currentUser.company.companyName}" path="companyName"/>
                                <label for="company-name">Tên nhà xe</label>
                            </div>
                            <div class="form-floating mb-2">
                                <form:input class="form-control" id="address" type="text" placeholder="Địa chỉ văn phòng" value="${currentUser.company.address}" path="address"/>
                                <label for="address">Địa chỉ văn phòng</label>
                            </div>
                            <div class="form-floating mb-2">
                                <form:input class="form-control" id="email" type="email" placeholder="Email" value="${currentUser.company.email}" path="email"/>
                                <label for="email">Email</label>
                            </div>
                            <div class="form-floating mb-2">
                                <form:input class="form-control" id="phone-number" type="text" placeholder="Số điện thoại" value="${currentUser.company.phoneNumber}" path="phoneNumber"/>
                                <label for="phone-number">Số điện thoại</label>
                            </div>

                        </div>
                    </div>
            </div>

            <!-- Modal footer -->
            <div class="modal-footer">
                <button type="submit" class="btn btn-success" data-bs-dismiss="modal">Xác nhận</button>
            </div>
            </form:form>    

        </div>
    </div>
</div>