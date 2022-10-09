<%-- 
    Document   : car-mn
    Created on : Oct 9, 2022, 1:55:22 AM
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
                    <a href="<c:url value="/company/manager/details"/>" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Thông tin nhà xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/company/manager/car"/>" class="menu-link active">
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
        <div class="col-9 mt-4">
            <label class="d-flex justify-content-center fw-bold fs-4">
                Danh sách xe
            </label>
            <div class="car-list mt-4 d-flex justify-content-center">
                <table class="custom-table">
                    <tr>
                        <th>STT</th>
                        <th>Loại xe</th>
                        <th>Chỗ ngồi</th>
                        <th>Biển số</th>
                        <th>Chức năng</th>
                    </tr>
                    <c:forEach var="i" begin="0" end="${cars.size()-1}">
                        <tr>
                            <td>${i+1}</td>
                            <td>${cars[i].typeId.typeName}</td>
                            <td>${cars[i].typeId.seatTotal}</td>
                            <td>${cars[i].carNumber}</td>
                            <td>
                                <button type="button" class="btn btn-primary update-car" data-bs-toggle="modal" data-bs-target="#updateCar" data-id="${cars[i].carId}" data-car-number="${cars[i].carNumber}" onclick="getCar(${cars[i].carId})">Sửa</button>
                                <c:url value="/company/car/delete/${cars[i].carId}" var="deleteCar"/>
                                <form action="${deleteCar}" method="post" class="d-inline">
                                    <button type="submit" class="btn btn-primary">Xoá</button>
                                </form>
                            </td>
                        </tr> 
                    </c:forEach>
                </table>
            </div>
            <div class="add-btn m-3 d-flex justify-content-center">
                <button type="button" class="btn btn-primary d-flex justify-content-center" data-bs-toggle="modal" data-bs-target="#addCar">Thêm mới</button>
            </div>
        </div>
    </div>
</div>
<div class="modal" id="addCar">
    <div class="modal-dialog">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Thêm Xe</h4>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <c:url value="/company/car/create" var="addCar"/>
            <form:form action="${addCar}" method="post" modelAttribute="car">
                <!-- Modal body -->
                <div class="modal-body">
                    <div class="car-type d-flex justify-content-lg-between m-3">
                        <span>Loại xe:</span>
                        <form:select class="form-select w-75" path="typeId">
                            <c:forEach var="ct" items="${carTypes}">
                                <option value="${ct.typeId}">${ct.typeName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="car-number d-flex justify-content-lg-between m-3">
                        <span>Biển số xe:</span>
                        <div class="input-group w-75">
                            <form:input type="text" class="form-control" path="carNumber"/>
                        </div>
                    </div>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="submit" class="btn btn-danger" data-bs-dismiss="modal">Thêm mới</button>
                </div>
            </form:form>
        </div>
    </div>
</div>
<div class="modal" id="updateCar">
    <div class="modal-dialog">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 id="test" class="modal-title">Chỉnh sửa thông tin xe</h4>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>


            <c:url value="/company/car/update" var="updateCar"/>
            <form:form action="${updateCar}" method="post" modelAttribute="car">
                <!-- Modal body -->
                <div class="modal-body">
                    <form:input type="hidden" id="update-car-id" path="carId" value=""/>
                    <div class="car-type d-flex justify-content-lg-between m-3">
                        <span>Loại xe:</span>
                        <form:select class="form-select w-75" path="typeId" id="update-car-type">
                            <c:forEach var="ct" items="${carTypes}">
                                <option class="car-type-opt" value="${ct.typeId}">${ct.typeName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="car-number d-flex justify-content-lg-between m-3">
                        <span>Biển số xe:</span>
                        <div class="input-group w-75">
                            <form:input id="update-car-number" type="text" class="form-control" path="carNumber" value=""/>
                        </div>
                    </div>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="submit" class="btn btn-danger" data-bs-dismiss="modal">Cập nhật</button>
                </div>
            </form:form>

        </div>
    </div>
</div>


<script>
    
    $(".update-car").click(function () {
        $("#update-car-id").val($(this).data("id"));
        $("#update-car-number").val($(this).data("car-number"));
    });
</script>