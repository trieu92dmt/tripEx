<%-- 
    Document   : trip-mn
    Created on : Oct 9, 2022, 6:55:30 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
                    <a href="<c:url value="/company/manager/car"/>" class="menu-link">
                        <i class="fa-regular fa-user"></i>
                        <p>Quản lý xe</p>
                        <i class="fa-solid fa-angle-right"></i>
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/company/manager/trip"/>" class="menu-link active">
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
                    <a href="<c:url value="/company/extend"/>" class="menu-link">
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
                Danh sách chuyến xe
            </label>
            <form action="">
                <div class="trip-filter d-flex flex-wrap justify-content-lg-between">
                    <div class="filter-item d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Điểm xuất phát:</span>
                        <select id="dep-filter" class="form-select w-75 text-center" name="dep">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="p" items="${provinces}">
                                <option value="${p.provinceId}">${p.provinceName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="filter-item d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Điểm đến:</span>
                        <select id="des-filter" class="form-select w-75 text-center" name="des">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="p" items="${provinces}">
                                <option value="${p.provinceId}">${p.provinceName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="filter-item d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Ngày khởi hành:</span>
                        <div class="input-group w-75">
                            <input id="date-filter" type="date" class="form-control" name="date"/>
                        </div>
                    </div>
                </div>
                <div class="search-create-btn d-flex justify-content-center">
                    <button class="cus-button fw-bold d-block mx-3" role="button" onclick="searchTrips()" type="submit">Tìm kiếm</button>
                    <button class="cus-button fw-bold d-block mx-3" role="button" type="button" data-bs-toggle="modal" data-bs-target="#addTrip">Thêm mới</button>
                </div>
            </form>
            <div class="trip-filter-result">
                <table class="custom-table" id="tb-filter-rs">
                    <tr>
                        <th>STT</th>
                        <th>Tên xe</th>
                        <th>Điểm xuất phát</th>
                        <th>Đếm đến</th>
                        <th>Ngày khởi hành</th>
                        <th>Giờ khởi hành</th>
                        <th>Giá vé</th>
                        <th>Thời lượng dự kiến</th>
                        <th>Từ bến</th>
                        <th>Đến bến</th>
                        <th>Chức năng</th>
                    </tr>
                    <c:if test="${trips.size() > 0}">
                        <c:forEach var="i" begin="0" end="${trips.size()-1}">
                            <tr>
                                <td>${i+1}</td>
                                <td>${trips[i].carId.carName}</td>
                                <td>${trips[i].route.departure.provinceName}</td>
                                <td>${trips[i].route.destination.provinceName}</td>
                                <td><fmt:formatDate pattern = "dd-MM-yyyy" value = "${trips[i].dateTime}" /></td>
                                <td><fmt:formatDate type = "time" timeStyle = "short" value = "${trips[i].dateTime}" /></td>
                                <td>${trips[i].ticketPrice}</td>
                                <td>${trips[i].finishTime} Giờ</td>
                                <td>${trips[i].fromStation.stationName}</td>
                                <td>${trips[i].toStation.stationName}</td>
                                <td>                                
                                    <button type="button" class="btn btn-primary">Sửa</button>
                                    <button type="button" class="btn btn-primary">Xoá</button>
                                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#bookTicket-${trips[i].tripId}">Đặt vé</button>
                                </td>
                            </tr> 
                            <div class="modal" id="bookTicket-${trips[i].tripId}">
                                <div class="modal-dialog modal-xl">
                                    <div class="modal-content">

                                        <!-- Modal Header -->
                                        <div class="modal-header">
                                            <h4 class="modal-title">Đặt vé</h4>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                        </div>
                                        <!-- Modal body -->
                                        <div class="modal-body">
                                            <div class="trip-info">
                                                <div class="add-trip-input d-flex justify-content-lg-between m-3">
                                                    <span class="fw-bold">Điểm xuất phát:</span>
                                                    <div class="input-group w-75">
                                                        <input type="text" class="form-control"value="${trips[i].route.departure.provinceName}" disabled/>
                                                    </div>
                                                </div>
                                                <div class="add-trip-input d-flex justify-content-lg-between m-3">
                                                    <span class="fw-bold">Điểm đến:</span>
                                                    <div class="input-group w-75">
                                                        <input type="text" class="form-control"value="${trips[i].route.destination.provinceName}" disabled/>
                                                    </div>
                                                </div>
                                                <div class="add-trip-input d-flex justify-content-lg-between m-3">
                                                    <span class="fw-bold">Ngày giờ khởi hành:</span>
                                                    <div class="input-group w-75">
                                                        <fmt:formatDate pattern = "dd-MM-yyyy" value = "${trips[i].dateTime}" />
                                                        -
                                                        <fmt:formatDate type = "time" timeStyle = "short" value = "${trips[i].dateTime}" />
                                                    </div>
                                                </div>
                                                <div class="add-trip-input d-flex justify-content-lg-between m-3">
                                                    <span class="fw-bold">Giá vé:</span>
                                                    <div class="input-group w-75">
                                                        <input id="price-per-ticket" type="text" class="form-control"value="${trips[i].ticketPrice} vnđ" disabled/>
                                                    </div>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="ticket-wrapper d-flex">
                                                <div class="seats" id="seats">
                                                    <label class="list-seat-title fw-bold fs-5">
                                                        Sơ đồ ghế ngồi
                                                    </label>
                                                    <div class="list-seat-container d-flex justify-content-md-around">
                                                        <c:set var="split" value="${fn:split(trips[i].carId.typeId.typeName, '_')}" />
                                                        <c:if test="${split[0] == 'GHENAM'}">
                                                            <div class="upstairs">
                                                                <label class="upstairs-title mt-3 text-center">
                                                                    Tầng trên
                                                                </label>
                                                                <div class="upstairs-wrapper d-flex">
                                                                    <div class="A-class d-flex flex-column p-3">
                                                                        <c:forEach var="s" items="${trips[i].carId.typeId.seatSet}">
                                                                            <c:if test="${fn:substring(s.seatNumber,0,1) == 'A' && fn:substring(s.seatNumber,2,3) == 'T'}">
                                                                                <button type="button" class="m-2 btn-seat">${s.seatNumber}</button>
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </div>
                                                                    <div class="B-class d-flex flex-column p-3">
                                                                        <c:forEach var="s" items="${trips[i].carId.typeId.seatSet}">
                                                                            <c:if test="${fn:substring(s.seatNumber,0,1) == 'B' && fn:substring(s.seatNumber,2,3) == 'T'}">
                                                                                <button type="button" class="m-2 btn-seat">${s.seatNumber}</button>
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </div>
                                                                    <div class="C-class d-flex flex-column p-3">
                                                                        <c:forEach var="s" items="${trips[i].carId.typeId.seatSet}">
                                                                            <c:if test="${fn:substring(s.seatNumber,0,1) == 'C' && fn:substring(s.seatNumber,2,3) == 'T'}">
                                                                                <button type="button" class="m-2 btn-seat">${s.seatNumber}</button>
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="downstairs">
                                                                <label class="downstairs-title mt-3 text-center">
                                                                    Tầng dưới
                                                                </label>
                                                                <div class="downstairs-wrapper d-flex">
                                                                    <div class="A-class d-flex flex-column p-3">
                                                                        <c:forEach var="s" items="${trips[i].carId.typeId.seatSet}">
                                                                            <c:if test="${fn:substring(s.seatNumber,0,1) == 'A' && fn:substring(s.seatNumber,2,3) == 'D'}">
                                                                                <button type="button" class="m-2 btn-seat">${s.seatNumber}</button>
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </div>
                                                                    <div class="B-class d-flex flex-column p-3">
                                                                        <c:forEach var="s" items="${trips[i].carId.typeId.seatSet}">
                                                                            <c:if test="${fn:substring(s.seatNumber,0,1) == 'B' && fn:substring(s.seatNumber,2,3) == 'D'}">
                                                                                <button type="button" class="m-2 btn-seat">${s.seatNumber}</button>
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </div>
                                                                    <div class="C-class d-flex flex-column p-3">
                                                                        <c:forEach var="s" items="${trips[i].carId.typeId.seatSet}">
                                                                            <c:if test="${fn:substring(s.seatNumber,0,1) == 'C' && fn:substring(s.seatNumber,2,3) == 'D'}">
                                                                                <button type="button" class="m-2 btn-seat">${s.seatNumber}</button>
                                                                            </c:if>
                                                                        </c:forEach>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </c:if>
                                                    </div>
                                                    <div class="note d-flex">
                                                        <div class="empty-seat">
                                                            <button type="button" class="m-2 btn-seat-empty">A1T</button>
                                                            <span>Ghế trống</span>
                                                        </div>
                                                        <div class="booked-seat">
                                                            <button type="button" class="m-2 btn-seat-booked">A1T</button>
                                                            <span>Ghế đã đặt</span>
                                                        </div>
                                                        <div class="bought-seat">
                                                            <button type="button" class="m-2 btn-seat-bought">A1T</button>
                                                            <span>Ghế đã mua</span>
                                                        </div>
                                                        <div class="chosing-seat">
                                                            <button type="button" class="m-2 btn-seat-chosing">A1T</button>
                                                            <span>Ghế đang chọn</span>
                                                        </div>
                                                    </div>  
                                                </div>
                                                <div class="infor-ticket-book w-25">
                                                    <lable class="infor fw-bold fs-5">
                                                        Thông tin đặt - mua vé
                                                    </lable>
                                                    <div class="main-info mt-3">
                                                        <div class="chosen-ticket">
                                                            <span>
                                                                Số vé đã chọn: 
                                                            </span>
                                                            <span id="chosen-ticket-list" class="chosen-ticket-list">
                                                                0
                                                            </span>
                                                        </div>
                                                        <div class="total-m">
                                                            <span>
                                                                Thành tiền: 
                                                            </span>
                                                            <span id="total" class="total">
                                                                0 đ
                                                            </span>
                                                        </div>
                                                        <form class="user-info-ticket">
                                                            <span class="fw-bold">Tên người mua - hoặc đặt vé:</span>
                                                            <div class="input-group w-100">
                                                                <input type="text" class="form-control"/>
                                                            </div>
                                                            <span class="fw-bold">Email người mua - hoặc đặt vé:</span>
                                                            <div class="input-group w-100">
                                                                <input type="email" class="form-control"/>
                                                            </div>
                                                            <span class="fw-bold">Sđt người mua - hoặc đặt vé:</span>
                                                            <div class="input-group w-100">
                                                                <input type="text" class="form-control"/>
                                                            </div>
                                                            <div class="btn-action d-flex justify-content-center">
                                                                <button class="cus-button fw-bold d-block m-2" role="button" type="submit">Mua vé</button>
                                                                <button class="cus-button fw-bold d-block m-2" role="button" type="submit">Đặt vé</button>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- Modal footer -->
                                        <div class="modal-footer">
                                            <button type="submit" class="btn btn-danger" data-bs-dismiss="modal">Đóng</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </c:if>
                </table>
            </div>
        </div>
    </div>
</div>
<div class="modal" id="addTrip">
    <div class="modal-dialog modal-xl">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Thêm Chuyến Xe</h4>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <!-- Modal body -->
            <c:url value="/company/trip/create" var="addTrip"/>
            <form:form action="${addTrip}" method="post" modelAttribute="tripCreate">
                <div class="modal-body add-trip-form">
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Điểm xuất phát:</span>
                        <form:select class="form-select w-75 text-center" path="departure">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="p" items="${provinces}">
                                <option value="${p.provinceId}">${p.provinceName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Điểm đến:</span>
                        <form:select class="form-select w-75 text-center" path="destination">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="p" items="${provinces}">
                                <option value="${p.provinceId}">${p.provinceName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Từ bến:</span>
                        <form:select class="form-select w-75 text-center" path="fromStation">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="s" items="${stations}">
                                <option value="${s.stationId}">${s.stationName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Đến bến:</span>
                        <form:select class="form-select w-75 text-center" path="toStation">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="s" items="${stations}">
                                <option value="${s.stationId}">${s.stationName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Ngày giờ khởi hành:</span>
                        <div class="input-group w-75">
                            <form:input type="datetime-local" class="form-control" path="dateTime"/>
                        </div>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Xe:</span>
                        <form:select class="form-select w-75 text-center" path="carId">
                            <option value="0">---Tất cả---</option>
                            <c:forEach var="c" items="${cars}">
                                <option value="${c.carId}">${c.carName}</option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Giá vé:</span>
                        <div class="input-group w-75">
                            <form:input type="text" class="form-control" path="ticketPrice" value=""/>
                        </div>
                    </div>
                    <div class="add-trip-input d-flex justify-content-lg-between m-3">
                        <span class="fw-bold">Thời lượng dự kiến (Giờ):</span>
                        <div class="input-group w-75">
                            <form:input type="text" class="form-control" path="finishTime" value=""/>
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

