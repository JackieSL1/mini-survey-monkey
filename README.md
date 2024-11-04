<p align="center">
<img src="https://upload.wikimedia.org/wikipedia/commons/9/93/Typing_monkey_768px.png" height="150">
</p>
<h1 align="center">
Mini Survey Monkey
</h1>
<p align="center">
The world's second most popular survey platform.
<p>

<p align="center">
<a href="https://mini-survey-monkey-eyd6fhfyesf6ezay.canadaeast-01.azurewebsites.net/">🌐 Web App</a> |
<a href="https://mini-survey-monkey-eyd6fhfyesf6ezay.canadaeast-01.azurewebsites.net/banana">🍌 Banana</a>
</p>

## Table of contents

<details>
<summary>Expand contents</summary>

- [Use Cases](#use-cases)

</details>

## Use cases

### Create account
New user should be able to create an account.

**Steps:**
* On the `login` page, user clicks `Don't have an account? Sign up` button
* User is prompted to give `username` and `password`
* System should fail to create account and prompt user to enter a different `username` if `username` already exists
* System displays confirmation if account is created and directs the user back to the `login` page

### Login
Existing user should be able to log into their account.

**Steps:**
* On the `login` page, user enters `username` and `password`
* System should fail to log in and notify user if `username` doesn't exist
* System should fail to log in and notify user if `password` is incorrect
* User is directed to their `home` page upon successful log in