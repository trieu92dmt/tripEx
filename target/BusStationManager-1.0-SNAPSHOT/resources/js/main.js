function scrollToSearch() {
    $('html, body').animate({
        scrollTop: $("#search-form").offset().top
    }, 1000);
};

let subMenu = document.getElementById("subMenu");

function toggleMenu(){
    subMenu.classList.toggle("open-menu");
}



$("#upload-img").on("change", function ()
{
    var files = !!this.files ? this.files : [];
    if (!files.length || !window.FileReader)
        return; // no file selected, or no FileReader support

    if (/^image/.test(files[0].type)) { // only image file
        var reader = new FileReader(); // instance of the FileReader
        reader.readAsDataURL(files[0]); // read the local file

        reader.onloadend = function () { // set image data as background of div
            $("#image-preview").css("background-image", "url(" + this.result + ")");
        }
    }
});

function getCar(carId) {
    fetch(`http://localhost:8080/TripEx/api/car/get/${carId}`).then(function (res) {
        return res.json();
    }).then(function (data) {
        console.log(data);
        var carTypeId = data.typeId.typeId;
        var opt = document.getElementsByClassName("car-type-opt");
        for (var i = 0; i < opt.length; i++){
            opt[i].removeAttribute("selected");
            if (opt[i].value == carTypeId)
                opt[i].setAttribute('selected', true);
        }
    });
}