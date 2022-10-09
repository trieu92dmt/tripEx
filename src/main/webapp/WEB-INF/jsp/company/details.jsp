<%-- 
    Document   : details
    Created on : Sep 25, 2022, 11:22:24 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div style="margin: 0 80px;" class="fluid-container">
    <div class="titile text-center">
        <label class="fs-2 fw-bold m-4">Chi tiết nhà xe</label>
    </div>
    <div class="company-info-container d-flex">
        <div class="company-info d-flex">
            <div class="company-avt">
                <img class="w-100" src="<c:url value="/images/benxe2.jpeg"/>" alt="alt"/>
            </div>
            <div class="basic-info d-flex justify-content-lg-between">
                <div class="basic-info-title">
                    <h3>Tên nhà xe: </h3>
                    <h5>Số điện thoại: </h5>
                    <h5>Email: </h5>
                    <h5>Địa chỉ văn phòng: </h5>
                    <h5>Đánh giá:</h5>
                </div>
                <div class="basic-info-content text-end">
                    <h3>Nhà xe Phương Trang</h3>
                    <h5>0948513923</h5>
                    <h5>trieu251101@gmail.com</h5>
                    <h5>TP.Hồ Chí Minh</h5>
                    <div>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star"></span>
                        <span class="fa fa-star"></span>
                    </div>
                </div>
            </div> 
        </div>
        <div class="list-route px-3">
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
            <div class="route-item">
                <span class="departure">TP.Hồ Chí Minh</span>
                <i class="fa-solid fa-arrow-right-arrow-left px-3"></i>
                <span class="destination">Bình Thuận</span>
            </div>
        </div>
    </div>
    <div class="book">
        <div class="ticket-search-form">
            <form class="m-4" action="<c:url value="/carCompanyDetails/${carcompany.id}"/>">
                <div class="search-form m-3" id="search-form">
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
                </div>
            </form>
        </div>
    </div>
    <div class="rate">
        <label class="fs-4">
            Đánh giá
        </label>
        <span class="fa fa-star checked"></span>
        <span class="fa fa-star checked"></span>
        <span class="fa fa-star checked"></span>
        <span class="fa fa-star checked"></span>
        <span class="fa fa-star"></span>
        <p>4.1 average based on 254 reviews.</p>
        <hr style="border:3px solid #f1f1f1">

        <div class="row">
            <div class="side">
                <div>5 star</div>
            </div>
            <div class="middle">
                <div class="bar-container">
                    <div class="bar-5"></div>
                </div>
            </div>
            <div class="side right">
                <div>150</div>
            </div>
            <div class="side">
                <div>4 star</div>
            </div>
            <div class="middle">
                <div class="bar-container">
                    <div class="bar-4"></div>
                </div>
            </div>
            <div class="side right">
                <div>63</div>
            </div>
            <div class="side">
                <div>3 star</div>
            </div>
            <div class="middle">
                <div class="bar-container">
                    <div class="bar-3"></div>
                </div>
            </div>
            <div class="side right">
                <div>15</div>
            </div>
            <div class="side">
                <div>2 star</div>
            </div>
            <div class="middle">
                <div class="bar-container">
                    <div class="bar-2"></div>
                </div>
            </div>
            <div class="side right">
                <div>6</div>
            </div>
            <div class="side">
                <div>1 star</div>
            </div>
            <div class="middle">
                <div class="bar-container">
                    <div class="bar-1"></div>
                </div>
            </div>
            <div class="side right">
                <div>20</div>
            </div>
        </div>
    </div>
    <div class="comments mt-3">
        <div class="cmt-form">
            <div class="text-dark">
                <div class="">
                    <div class="">
                        <div class="card m-0">
                            <div class="card-body p-4">
                                <div class="d-flex flex-start w-100">
                                    <img class="rounded-circle shadow-1-strong me-3"
                                         src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(21).webp" alt="avatar" width="65"
                                         height="65" />
                                    <div class="w-100">
                                        <h5>Add a comment</h5>
                                        <ul style="list-style-type: none" class="rating mb-3 d-flex p-0" data-mdb-toggle="rating">
                                            <li class="pe-2">
                                                <i class="far fa-star fa-sm text-danger" title="Bad"></i>
                                            </li>
                                            <li class="pe-2">
                                                <i class="far fa-star fa-sm text-danger" title="Poor"></i>
                                            </li>
                                            <li class="pe-2">
                                                <i class="far fa-star fa-sm text-danger" title="OK"></i>
                                            </li>
                                            <li class="pe-2">
                                                <i class="far fa-star fa-sm text-danger" title="Good"></i>
                                            </li>
                                            <li class="pe-2">
                                                <i class="far fa-star fa-sm text-danger" title="Excellent"></i>
                                            </li>
                                        </ul>
                                        <div class="form-outline">
                                            <textarea class="form-control" id="textAreaExample" rows="4" placeholder="Thêm bình luận"></textarea>
                                        </div>
                                        <div class="d-flex justify-content-end mt-3">
                                            <button type="button" class="btn btn-danger">
                                                Send <i class="fas fa-long-arrow-alt-right ms-1"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="mt-3 mb-5">
            <div class="">
                <div class="col-md-12 col-lg-10 w-100">
                    <div class="card text-dark m-0">
                        <div class="card-body p-4">
                            <h4 class="mb-0">Recent comments</h4>
                            <p class="fw-light mb-4 pb-2">Latest Comments section by users</p>

                            <div class="d-flex flex-start">
                                <img class="rounded-circle shadow-1-strong me-3"
                                     src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(23).webp" alt="avatar" width="60"
                                     height="60" />
                                <div>
                                    <h6 class="fw-bold mb-1">Maggie Marsh</h6>
                                    <div class="d-flex align-items-center mb-3">
                                        <p class="mb-0">
                                            March 07, 2021
                                            <span class="badge bg-primary">Pending</span>
                                        </p>
                                        <a href="#!" class="link-muted"><i class="fas fa-pencil-alt ms-2"></i></a>
                                        <a href="#!" class="link-muted"><i class="fas fa-redo-alt ms-2"></i></a>
                                        <a href="#!" class="link-muted"><i class="fas fa-heart ms-2"></i></a>
                                    </div>
                                    <p class="mb-0">
                                        Lorem Ipsum is simply dummy text of the printing and typesetting
                                        industry. Lorem Ipsum has been the industry's standard dummy text ever
                                        since the 1500s, when an unknown printer took a galley of type and
                                        scrambled it.
                                    </p>
                                </div>
                            </div>
                        </div>

                        <hr class="my-0" />

                        <div class="card-body p-4">
                            <div class="d-flex flex-start">
                                <img class="rounded-circle shadow-1-strong me-3"
                                     src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(26).webp" alt="avatar" width="60"
                                     height="60" />
                                <div>
                                    <h6 class="fw-bold mb-1">Lara Stewart</h6>
                                    <div class="d-flex align-items-center mb-3">
                                        <p class="mb-0">
                                            March 15, 2021
                                            <span class="badge bg-success">Approved</span>
                                        </p>
                                        <a href="#!" class="link-muted"><i class="fas fa-pencil-alt ms-2"></i></a>
                                        <a href="#!" class="text-success"><i class="fas fa-redo-alt ms-2"></i></a>
                                        <a href="#!" class="link-danger"><i class="fas fa-heart ms-2"></i></a>
                                    </div>
                                    <p class="mb-0">
                                        Contrary to popular belief, Lorem Ipsum is not simply random text. It
                                        has roots in a piece of classical Latin literature from 45 BC, making it
                                        over 2000 years old. Richard McClintock, a Latin professor at
                                        Hampden-Sydney College in Virginia, looked up one of the more obscure
                                        Latin words, consectetur, from a Lorem Ipsum passage, and going through
                                        the cites.
                                    </p>
                                </div>
                            </div>
                        </div>

                        <hr class="my-0" style="height: 1px;" />

                        <div class="card-body p-4">
                            <div class="d-flex flex-start">
                                <img class="rounded-circle shadow-1-strong me-3"
                                     src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(33).webp" alt="avatar" width="60"
                                     height="60" />
                                <div>
                                    <h6 class="fw-bold mb-1">Alexa Bennett</h6>
                                    <div class="d-flex align-items-center mb-3">
                                        <p class="mb-0">
                                            March 24, 2021
                                            <span class="badge bg-danger">Rejected</span>
                                        </p>
                                        <a href="#!" class="link-muted"><i class="fas fa-pencil-alt ms-2"></i></a>
                                        <a href="#!" class="link-muted"><i class="fas fa-redo-alt ms-2"></i></a>
                                        <a href="#!" class="link-muted"><i class="fas fa-heart ms-2"></i></a>
                                    </div>
                                    <p class="mb-0">
                                        There are many variations of passages of Lorem Ipsum available, but the
                                        majority have suffered alteration in some form, by injected humour, or
                                        randomised words which don't look even slightly believable. If you are
                                        going to use a passage of Lorem Ipsum, you need to be sure.
                                    </p>
                                </div>
                            </div>
                        </div>

                        <hr class="my-0" />

                        <div class="card-body p-4">
                            <div class="d-flex flex-start">
                                <img class="rounded-circle shadow-1-strong me-3"
                                     src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(24).webp" alt="avatar" width="60"
                                     height="60" />
                                <div>
                                    <h6 class="fw-bold mb-1">Betty Walker</h6>
                                    <div class="d-flex align-items-center mb-3">
                                        <p class="mb-0">
                                            March 30, 2021
                                            <span class="badge bg-primary">Pending</span>
                                        </p>
                                        <a href="#!" class="link-muted"><i class="fas fa-pencil-alt ms-2"></i></a>
                                        <a href="#!" class="link-muted"><i class="fas fa-redo-alt ms-2"></i></a>
                                        <a href="#!" class="link-muted"><i class="fas fa-heart ms-2"></i></a>
                                    </div>
                                    <p class="mb-0">
                                        It uses a dictionary of over 200 Latin words, combined with a handful of
                                        model sentence structures, to generate Lorem Ipsum which looks
                                        reasonable. The generated Lorem Ipsum is therefore always free from
                                        repetition, injected humour, or non-characteristic words etc.
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>