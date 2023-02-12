fillRegionSelectorData();

function fetchUserData() {
    let nameValue = document.getElementById(nameId).value;
    let emailValue = document.getElementById(emailId).value;
    let usernameValue = document.getElementById(usernameId).value;
    let passwordValue = document.getElementById(passwordId).value;
    let dateValue = document.getElementById(dateId).value;
    validateName(nameValue, goodName, badName);

    let user = {
        name: nameValue,
        username: usernameValue,
        email: emailValue,
        password: passwordValue,
        date: dateValue
    };

    console.log(user);
    requestUserData(user);
}

function redirectToLogin() {
    window.location.href = loginPage;
}

function requestUserData(user) {
    var signupUrl = 'api/auth/signup';
    $.ajax({
        type: 'POST',
        url: signupUrl,
        data: user,
        success: function (response) {
            console.log(response);
        },
        error: function (response) {
            console.log(response);
        }
    })
}
function validateName(name, correctName, incorrectName) {
    if (name.length >= 3) {
        correctName(errorLabelId);
    }
    else {
        incorrectName(errorLabelId);
    }
}

let goodName = (errorLabelId) => document.getElementById(errorLabelId).style.visibility = 'hidden';
let badName = (errorLabelId) => document.getElementById(errorLabelId).style.visibility = 'visible';


function getRegions() {
    var regions = ['Kyiv', 'Chernihiv', 'Lviv', 'Chernivtsi']

    return regions;
}

function fillRegionSelectorData() {
    const selectNameId = 'select-name-id';
    const option = 'option';

    let regions = getRegions();
    let select = document.getElementById(selectNameId);

    clearSelectorData(select);

    for (let i = 0; i < regions.length; i++) {
        var opt = document.createElement(option);
        opt.value = i;
        opt.innerHTML = regions[i];
        select.appendChild(opt);
    }
}
function clearSelectorData (select) {
    for (let i = select.options.length - 1; i >= 0; i--){
        select.remove(i);
    }
    console.log(select.options);
}

const nameId = 'name';
const usernameId = 'username';
const emailId = 'email';
const passwordId = 'password';
const dateId = 'date';
const errorLabelId = 'error-label-id';

const baseUrl = 'http://localhost:8081/'
const loginPage = baseUrl + 'login';
