function getLoginData() {
    let loginValue = document.getElementById(loginId).value;
    let passwordValue = document.getElementById(passwordId).value;

    let loginData = {
        username: loginValue,
        password: passwordValue
    }
    return loginData;
}

function authentificationUser() {
    let loginData = getLoginData();
    const singInUrl = 'api/auth/signin';
        $.ajax({
            type: 'POST',
            url: singInUrl,
            data: JSON.stringify(loginData),
            dataType: 'json',
            contentType: 'application/json',
            success: function (response) {
                var token = response.token;
                 if (token != null) {
                     localStorage.setItem('token', token);
                     window.location.href = baseUrl + 'greeting';
                 }
            },
            error: function(response){
                console.log(response);
            }
        });
}

function getGreetingPage(token) {
    $.ajax({
                type: 'GET',
                url: baseUrl + 'greeting',
                headers: {
                    'Content-Type' : "Application/json",
                    'Authorization' : 'Bearer ' + token
                },
                             success: function (response) {
                             response.redirect(baseUrl + 'greeting');
                                var v = window.open(baseUrl + 'greeting');
                                v.document.write(response);
                                v.document.close();
                             },
                             error: function(response){
                                 console.log(response);
                             }
            });
}

function redirectToRegistration() {
    window.location.href = registrationPage;
}

const loginId = 'login';
const passwordId = 'password';
const baseUrl = 'http://localhost:8081/'
const registrationPage = baseUrl + 'registration';