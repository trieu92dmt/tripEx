<%-- 
    Document   : trip-search
    Created on : Oct 15, 2022, 5:54:48 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href=" <c:url value="/css/range-slider.css"/>" rel="stylesheet"/>
<div class="container" style="background-color: #fcfbfb">
    <label class="title d-flex justify-content-center fw-bold p-4 fs-2">
        Kết Quả Tra Cứu
    </label>
    <div class="search">
        <form action="#">
            <div class="search-result search-form-containner">
                <div class="search-items">
                    <div class="input-wrap">
                        <div class="icon-wrap">
                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                <path d="M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zm0 9.5c-1.38 0-2.5-1.12-2.5-2.5s1.12-2.5 2.5-2.5 2.5 1.12 2.5 2.5-1.12 2.5-2.5 2.5z"></path>
                            </svg>
                        </div>
                        <div class="input-field">
                            <label>ĐIỂM BẮT ĐẦU</label>
                            <input type="text" placeholder="Điểm bắt đầu" />
                        </div>
                    </div>
                    <div class="input-wrap">
                        <div class="icon-wrap">
                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                <path d="M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zm0 9.5c-1.38 0-2.5-1.12-2.5-2.5s1.12-2.5 2.5-2.5 2.5 1.12 2.5 2.5-1.12 2.5-2.5 2.5z"></path>
                            </svg>
                        </div>
                        <div class="input-field">
                            <label>ĐIỂM ĐẾN</label>
                            <input type="text" placeholder="Điểm đến" />
                        </div>
                    </div>
                    <div class="input-wrap">
                        <div class="icon-wrap">
                            <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                                <path d="M17 12h-5v5h5v-5zM16 1v2H8V1H6v2H5c-1.11 0-1.99.9-1.99 2L3 19c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2h-1V1h-2zm3 18H5V8h14v11z"></path>
                            </svg>
                        </div>
                        <div class="input-field">
                            <label>NGÀY ĐI</label>
                            <input class="datepicker" type="date" placeholder="mm/dd/yy" />
                        </div>
                    </div>
                </div>
                <button class="btn-search d-block" type="submit">Search</button>
            </div>
        </form>
    </div>
    <div class="trip-search-result mt-3">
        <div class="filter-sp p-3 me-3">
            <div class="filter-sp-wrapper">
                <label class="filter-sp-title d-flex justify-content-center fw-bold fs-5">
                    Bộ lọc
                </label>
                <div class="filter-sp-items p-3">
                    <div class="time-filter">
                        <span>
                            Thời điểm xuất phát
                        </span>
                        <div class="time-filter-item d-flex flex-wrap">
                            <button type="button" class="btn btn-outline-success">Sáng sớm</button>
                            <button type="button" class="btn btn-outline-success">Buổi sáng</button>
                            <button type="button" class="btn btn-outline-success">Buổi chiều</button>
                            <button type="button" class="btn btn-outline-success">Buổi tối</button>
                        </div>
                    </div>
                    <div class="company-filter p-3">
                        <div class="company-filter-select">
                            <span class="">Nhà xe:</span>
                            <select id="company-filter" class="form-select w-75 text-center" name="company">
                                <option value="0">---Tất cả---</option>
                                <c:forEach var="c" items="${companies}">
                                    <option value="${c.userId}">${c.companyName}</option>
                                </c:forEach>
                            </select>
                        </div>
                        </span>
                    </div>
                    <div class="car-type-filter p-3">
                        <span>
                            Loại xe
                        </span>
                    </div>
                    <div class="rate-filter p-3">
                        <span class="company-rate">
                            Đánh giá
                        </span>
                    </div>
                </div>
            </div>
        </div>
        <div class="main-result p-3">
            <div class="main-result-wrapper">
                <div class="sub-filter d-flex">
                    <label class="sub-filter-title fw-bold p-3">
                        Sắp xếp theo:
                    </label>
                    <a href="#" class="p-3">Giờ đi gần nhất</a>
                    <a href="#" class="p-3">Giá tăng dần</a>
                    <a href="#" class="p-3">Giá giảm dần</a>
                </div>
                <div class="result-items-wrapper p-3">
                    <div class="result-item d-flex mb-3">
                        <div class="image">
                            <img class="w-100" src="<c:url value="/images/icon.jpg"/>" alt="company-img"/>
                        </div>
                        <div class="main-trip-info">
                            <div class="info-header d-flex justify-content-lg-between m-2">
                                <div class="company-name-rate">
                                    <span class="company-name">Kumho</span>
                                    <span class="company-rate badge bg-success"><i class="fa-solid fa-star"></i>4.5(1050)</span>
                                </div>
                                <span class="ticket-price">
                                    145000 vnđ
                                </span>
                            </div>
                            <div class="info-center m-2">
                                <span class="trip-car-type d-block">
                                    Xe giường nằm 35 chỗ
                                </span>
                                <span class="departure-time d-block">
                                    Giờ khỏi hành: 7:00 - 10/09/2022
                                </span>
                                <span class="determine d-block">
                                    Khoảng cách: 200km
                                </span>
                                <span class="estimate-time d-block">
                                    Thời gian ước tính: 4h
                                </span>
                            </div>
                            <div class="info-footer d-flex justify-content-center">
                                <span class="btn-details m-2">
                                    <a href="#" class="btn btn-success">Xem chi tiết</a>
                                </span>
                                <span class="btn-book m-2">
                                    <button type="button" class="btn btn-success">Đặt vé</button>
                                </span>
                            </div>
                        </div>
                    </div>
                    <div class="result-item d-flex mb-3">
                        <div class="image">
                            <img class="w-100" src="<c:url value="/images/icon.jpg"/>" alt="company-img"/>
                        </div>
                        <div class="main-trip-info">
                            <div class="info-header d-flex justify-content-lg-between m-2">
                                <div class="company-name-rate">
                                    <span class="company-name">Kumho</span>
                                    <span class="company-rate badge bg-success"><i class="fa-solid fa-star"></i>4.5(1050)</span>
                                </div>
                                <span class="ticket-price">
                                    145000 vnđ
                                </span>
                            </div>
                            <div class="info-center m-2">
                                <span class="trip-car-type d-block">
                                    Xe giường nằm 35 chỗ
                                </span>
                                <span class="departure-time d-block">
                                    Giờ khỏi hành: 7:00 - 10/09/2022
                                </span>
                                <span class="determine d-block">
                                    Khoảng cách: 200km
                                </span>
                                <span class="estimate-time d-block">
                                    Thời gian ước tính: 4h
                                </span>
                            </div>
                            <div class="info-footer d-flex justify-content-center">
                                <span class="btn-details m-2">
                                    <a href="#" class="btn btn-success">Xem chi tiết</a>
                                </span>
                                <span class="btn-book m-2">
                                    <button type="button" class="btn btn-success">Đặt vé</button>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <ul class="pagination d-flex justify-content-center">
                <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item"><a class="page-link" href="#">Next</a></li>
            </ul>
        </div>
    </div>
    <div class="popular-company">
        <label class="fs-3 fw-bold m-0">Nhà xe nổi bật</label>
        <div class="company-list">
            <div id="carouselExampleControls" class="carousel" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 1</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 2</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 3</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 4</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 5</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 6</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 7</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 8</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="img-wrapper"><img src="<c:url value="/images/logo1.jpg"/>" class="d-block w-100" alt="..."> </div>
                            <div class="card-body">
                                <h5 class="card-title">Card title 9</h5>
                                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                                    card's content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
        <a class="d-flex justify-content-end me-4" href="">Xem tất cả >></a>
    </div>
</div>
<script src="<c:url value="/js/range-slider.js"/>"></script>