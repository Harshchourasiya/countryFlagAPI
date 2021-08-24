<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Country Flag Rest API</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel=icon href=https://restcountries.eu/data/ind.svg sizes="16x16" type="image/png">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@1,300&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Oswald&family=Roboto:ital,wght@1,300;1,900&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Oswald&family=Roboto+Slab:wght@300&family=Roboto:ital,wght@1,300;1,900&display=swap" rel="stylesheet">
<style >
    .head{
        font-size: 40px; 
        font-family: 'Roboto', sans-serif; 
        padding-bottom: 10px; 
        margin-left: 30px;
    }
    .head_sub{
        font-size: 15px; 
        font-family: 'Roboto', sans-serif; 
        padding-bottom: 10px; 
        margin-left: 30px;
    }
    h4{
        font-family: 'Roboto Slab', serif;
    }

    .api{
        display: block;
        padding: 10px;
        background-color: ghostwhite;
        border: 1px solid black;
    }

    .result {
        display: block;
        padding: 10px;
        background-color:gainsboro;
        border: 1px solid black;
    }
</style>
</head>

<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="https://countryflagapi.herokuapp.com/">Country Flag</a>
            </div>
            <ul class="nav navbar-nav">
                <li class="btn active"><a href="https://countryflagapi.herokuapp.com/">Home</a></li>
                <li class="btn"><a href="https://github.com/Harshchourasiya/countryflagapi">Github</a></li>
                <li class="btn"><a href="https://github.com/Harshchourasiya/countryflagapi/issues">Issue</a></li>
            </ul>
        </div>
    </nav>
    <div style="margin-left: 10px;">
        <div>
            <h3  class="head">
                Country Flag Rest API
            </h3>

            <h6 class="head_sub">
                Get Country Flags by Country name, Country Code and Capital Name.
            </h6>
        </div>

        <hr>

        <h3 class="text-center" style="font-family: 'Oswald', sans-serif;">
            Documentation
        </h3>
        <br>
        <div class="container">
            <div >
                <h4>
                    Get All Country Details
                </h4>
                </br>
                <code class="api">
                    https://countryflagapi.herokuapp.com/all
                          </code>
            </div>
            <hr>
            <div>
                <h4>
                    Get Country details by Country Name
                </h4>
                </br>
                <code class="api">
                    https://countryflagapi.herokuapp.com/country/india
                        </code>
                </br>
                </br>
                <code class="result">
                          [ </br>
                          {"name":"india",</br>
                          "code":"IN",</br>
                          "capital":"New Delhi",</br>
                          "region":"Asia",</br>
                          "flag":"https://restcountries.eu/data/ind.svg"}</br>
                          ]
                        </code>
            </div>
            <hr>
            <div>
                <h4>
                    Get Country details by Country Code
                </h4>
                </br>
                <code class="api">
                    https://countryflagapi.herokuapp.com/code/IN
                        </code>
                </br>
                </br>
                <code class="result">
                          [ </br>
                          {"name":"india",</br>
                          "code":"IN",</br>
                          "capital":"New Delhi",</br>
                          "region":"Asia",</br>
                          "flag":"https://restcountries.eu/data/ind.svg"}</br>
                          ]
                        </code>
            </div>
            <hr>
            <div>
                <h4>
                    Get Countries details by search
                </h4>
                </br>
                <code class="api">
                    https://countryflagapi.herokuapp.com/search/in
                        </code>
                </br>
                </br>
                <code class="result">
                            [</br>
                            {"name":"india",</br>
                            "code":"IN",</br>
                            "capital":"New Delhi",</br>
                            "region":"Asia",</br>
                            "flag":"https://restcountries.eu/data/ind.svg"</br>
                        },</br>
                        {"name":"indonesia",</br>
                        "code":"ID",</br>
                        "capital":"Jakarta",</br>
                        "region":"Asia",</br>
                        "flag":"https://restcountries.eu/data/idn.svg"}</br>
                        ]
                        </code>
            </div>
        </div>
    </div>

</body>

</html>