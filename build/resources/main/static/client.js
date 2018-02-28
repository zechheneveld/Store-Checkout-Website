var requestArray = [];
var nameArray = [];

// $(document).ready(function () {
//    init();
// });
//
// function init() {
//    // enable();
// }
// function enable() {
//     goHome();
//     goCheckout();
//     goLog();
// }

function goLog() {
    window.location.href = "/log"
}

function goCheckout() {
    var regular = $("#regular").val();
    var strawberry = $("#strawberry").val();

    if(regular == '') {
        regular = 0;
    }
    if (strawberry == '') {
        strawberry = 0;
    }

    regQty = (parseFloat(regular));
    strQty = (parseFloat(strawberry));

    var newNumber = {};
    newNumber.Rlemon = regQty;
    newNumber.STlemon = strQty;

    requestArray.push(newNumber);


        sendToServer(requestArray);
}

function goHome() {
    window.location.href = "/"

}

function sendToServer() {

    window.location.href = "/math/" + regQty + "/" + strQty;

}
function goConfirm() {
    var firstName = $("#firstName").val();
    var lastName = $("#lastName").val();
    var address = $("#address").val();
    var city = $("#city").val();
    var state = $("#state").val();
    var zipCode = $("#zipCode").val();
    var creditCard = $("#creditCard").val();
    var expiration = $("#expiration").val();
    var CSV = $("#CSV").val();

    if(firstName == '') {
        firstName = null;
    }
    if(lastName == '') {
        lastName = null;
    }
    if(address == '') {
        address = null;
    }
    if(city == '') {
        city = null;
    }
    if(state == '') {
        state = null;
    }
    if(zipCode == '') {
        zipCode = null;
    }
    if(creditCard == '') {
        creditCard = null;
    }
    if(expiration == '') {
        expiration = null;
    }
    if(CSV == '') {
        CSV = null;
    }

    var newCustomer = {};
    newCustomer.fname = firstName;
    newCustomer.lname = lastName;
    newCustomer.address = address;
    newCustomer.city = city;
    newCustomer.state = state;
    newCustomer.zipCode = zipCode;
    newCustomer.creditCard = creditCard;
    newCustomer.expiration = expiration;
    newCustomer.CSV = CSV;


    nameArray.push(newCustomer);
    window.location.href = "/name/" + firstName + "/" + lastName + "/" + address + "/" + city + "/" + state + "/" + zipCode + "/" + creditCard + "/" + expiration + "/" + CSV;
}

