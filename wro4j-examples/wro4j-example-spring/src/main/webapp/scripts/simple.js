var COM = COM || {};
COM.simple = function(ready) {
    ready(function() {
        document.getElementById("ready").innerHTML = "This text was written with JavaScript!!!";
    });

}(ready);
