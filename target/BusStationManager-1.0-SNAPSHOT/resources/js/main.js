function scrollToSearch() {
    $('html, body').animate({
        scrollTop: $("#search-form").offset().top
    }, 1000);
};

let subMenu = document.getElementById("subMenu");

function toggleMenu(){
    subMenu.classList.toggle("open-menu");
}