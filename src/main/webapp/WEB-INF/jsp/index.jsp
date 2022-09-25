<%-- 
   Document   : index
   Created on : Aug 3, 2022, 6:04:44 PM
   Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="fluid-container">
    <div class="homepage-banner">
        <img class="w-100" src="<c:url value="/images/banner9.jpg"/>" alt="banner"/>
        <div class="banner-content">
            <div class="search-form" id="search-form">
                <form action="#">
                    <div class="banner-title fw-bold fs-1 d-flex justify-content-center mb-4">
                        <label>Bắt đầu chuyến đi</label>
                    </div>
                    <div class="search-form-containner">
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
        </div>
    </div>
    <div class="sponsor d-flex justify-content-center fs-3 p-3 my-1">
        <div style="color: #555">
            Chưa có nhà tài trợ
        </div>
    </div>
    <div class="popular-company">
        <label class="fs-3 fw-bold">Nhà xe nổi bật</label>
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
    <div class="information mt-5">
        <div class="information-container d-flex">
            <div class="l-info w-50">
                <label class="fs-3 fw-bold pb-3">
                    Hỗ trợ khách hàng với 3 tiêu chí:
                    <br>
                        <span>Dễ Dàng, Nhanh Chóng, Tiện Lợi</span>
                </label>
                <ul class="list-info p-0">
                    <li class="item">
                        <i class="fa-regular fa-circle-check"></i>
                        <span class="fw-bold">Dễ dàng sử dụng</span>
                        <br>
                            <span class="sub-info">
                                Giao diện thân thiện dễ nhìn phù hợp với mọi lứa tuổi
                            </span>
                    </li>
                    <li class="item">
                        <i class="fa-regular fa-circle-check"></i>
                        <span class="fw-bold">Giao dịch nhanh chóng</span>
                        <br>
                            <span class="sub-info">
                                Hỗ trợ người dùng với đa dạng phương thức thanh toán
                            </span>
                    </li>
                    <li class="item">
                        <i class="fa-regular fa-circle-check"></i>
                        <span class="fw-bold">Sử dụng ở bất cứ đâu</span>
                        <br>
                            <span class="sub-info">
                                Sử dụng được ở mọi nơi khi có kết nối internet
                            </span>
                    </li>
                </ul>
            </div>
            <div class="r-info w-50">
                <img class="w-100" src="<c:url value="/images/work1.jpg"/>" alt="work"/>
            </div>
        </div>
    </div>
    <div class="station-list">
        <label class="fw-bold fs-3">Bến xe khách</label>
        <div class="scroll-wrapper mt-2">
            <div class="station-list-container d-flex">
                <a class="item d-block mx-2" href="#">
                    <img class="w-100" src="<c:url value="/images/ben-xe-mien-dong.jpg"/>" alt="alt"/>
                    <label class="station-name">Bến Xe Miền Đông</label>
                </a>
                <a class="item d-block mx-2" href="#">
                    <img class="w-100" src="<c:url value="/images/ben-xe-mien-dong.jpg"/>" alt="alt"/>
                    <label class="station-name">Bến Xe Miền Đông</label>
                </a>
                <a class="item d-block mx-2" href="#">
                    <img class="w-100" src="<c:url value="/images/ben-xe-mien-dong.jpg"/>" alt="alt"/>
                    <label class="station-name">Bến Xe Miền Đông</label>
                </a>
                <a class="item d-block mx-2" href="#">
                    <img class="w-100" src="<c:url value="/images/ben-xe-mien-dong.jpg"/>" alt="alt"/>
                    <label class="station-name">Bến Xe Miền Đông</label>
                </a>
                <a class="item d-block mx-2" href="#">
                    <img class="w-100" src="<c:url value="/images/ben-xe-mien-dong.jpg"/>" alt="alt"/>
                    <label class="station-name">Bến Xe Miền Đông</label>
                </a>
                <a class="item d-block mx-2" href="#">
                    <img class="w-100" src="<c:url value="/images/ben-xe-mien-dong.jpg"/>" alt="alt"/>
                    <label class="station-name">Bến Xe Miền Đông</label>
                </a>
            </div>
        </div>
    </div>
    <div class="information mt-5">
        <div class="information-container d-flex">
            <div class="r-info w-50">
                <img class="w-100" src="<c:url value="/images/info.jpg"/>" alt="work"/>
            </div>
            <div style="padding-left:80px;" class="l-info w-50">
                <label class="fs-3 fw-bold pb-3">
                    Cung cấp công cụ hỗ trợ cho các nhà xe dễ dàng quản lý với đa dạng sự lựa chọn
                </label>
                <ul class="list-info p-0">
                    <li class="item">
                        <i class="fa-regular fa-circle-check"></i>
                        <span class="fw-bold">Cung cấp công cụ quản lý</span>
                        <br>
                            <span class="sub-info">
                                Bao gồm quản lý tuyến, quản lý chuyến, bán vé, thống kê ... 
                            </span>
                    </li>
                    <li class="item">
                        <i class="fa-regular fa-circle-check"></i>
                        <span class="fw-bold">Đa dạng sự lựa chọn</span>
                        <br>
                            <span class="sub-info">
                                Chọn gói dịch vụ phù hợp với nhà xe
                            </span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="btn-start">
        <button class="cus-button fw-bold fs-5" role="button" onclick="scrollToSearch()">BẮT ĐẦU CHUYẾN ĐI</button>
    </div>
</div>
