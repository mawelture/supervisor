window.onload = function() {

    $.ajax({
        "url" : "lan/host",
        "success": function(result) {
            alert(result);
        }
    });

};