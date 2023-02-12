const goalBaseUrl = 'http://localhost:8080/';
const loginPage = 'http://localhost:8081/login';

if (localStorage.getItem('token') === null) {
    redirectToLogin();
} else {
    getUserName();
}

function getUserName() {
    var username = 'you need to login';
    $.ajax({
        type: 'GET',
        url: '/persons/current/username',
        headers: {
                'Content-Type' : "Application/json",
                'Authorization' : 'Bearer ' + localStorage.getItem('token')
        },
        success: function (response) {
                greeting(response)
         },
        error: function(response){
               greeting('you need to login');
        }
    });
    return username;
}

function greeting(username) {
    const greetingLabelId = 'greeting-id';
    let helloUser = 'Hello ' + username;
    document.getElementById(greetingLabelId).innerHTML = helloUser;
}

function getTest() {
 $.ajax({
        type: 'GET',
        url: goalBaseUrl + 'goal/test',
        headers: {
                'Content-Type' : "Application/json",
                'Authorization' : 'Bearer ' + localStorage.getItem('token')
        },
        success: function (response) {
            alert(response);
         },
        error: function(response){
            alert('you need to login');
        }
    });
}

function logout() {
    $.ajax({
            type: 'GET',
            url: 'http://localhost:8081/api/auth/logout',
            success: function (response) {
                localStorage.removeItem('token');
                redirectToLogin();
             },
            error: function(response){
                alert('something went wrong...');
            }
        });
}

function redirectToLogin() {
    window.location.href = loginPage;
}