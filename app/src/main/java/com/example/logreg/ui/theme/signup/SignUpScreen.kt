package com.example.logreg.ui.theme.signup

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.logreg.ui.theme.components.HeaderText
import com.example.logreg.ui.theme.components.LoginTextField
import com.example.logreg.ui.theme.login.defaultPadding
import com.example.logreg.ui.theme.login.itemSpacing

@Composable
fun SignUpScreen() {

    val (firstName, setFirstName) = rememberSaveable {
        mutableStateOf("")
    }
    val (lastName, setLastName) = rememberSaveable {
        mutableStateOf("")
    }
    val (email, setEmail) = rememberSaveable {
        mutableStateOf("")
    }
    val (password, setPassword) = rememberSaveable {
        mutableStateOf("")
    }
    val (confirmPassword, setConfirmPassword) = rememberSaveable {
        mutableStateOf("")
    }
    val (checked, onCheckedChange) = rememberSaveable {
        mutableStateOf(false)
    }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            //.fillMaxSize()
            .padding(defaultPadding),

            //.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )

    {
        Spacer(Modifier.padding(top = 20.dp))
        HeaderText(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Start), text = "Sign Up"
        )
        Spacer(Modifier.height(itemSpacing))
        LoginTextField(
            value = firstName,
            onValueChange = setFirstName,
            labelText = "First Name",
            keyboardType = KeyboardType.Text,
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Start)

        )
        Spacer(Modifier.height(itemSpacing))
        LoginTextField(
            value = lastName,
            onValueChange = setLastName,
            labelText = "Last Name",
            keyboardType = KeyboardType.Text,
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Start)

        )
        Spacer(Modifier.height(itemSpacing))
        LoginTextField(
            value = email,
            onValueChange = setEmail,
            labelText = "Email",
            keyboardType = KeyboardType.Email,
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Start)

        )
        Spacer(Modifier.height(itemSpacing))
        LoginTextField(
            value = password,
            onValueChange = setPassword,
            labelText = "Password",
            keyboardType = KeyboardType.Password,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Start)

        )
        Spacer(Modifier.height(itemSpacing))
        LoginTextField(
            value = confirmPassword,
            onValueChange = setConfirmPassword,
            labelText = "Confirm Password",
            keyboardType = KeyboardType.Password,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Start)

        )
        Spacer(Modifier.height(itemSpacing))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

            ) {
//            val privacyText = "Privacy"
//            val policyText = "Policy"
//            val annotatedText = buildAnnotatedString {
//                withStyle(SpanStyle(color = MaterialTheme.colorScheme.onBackground)){
//                    append("I Agree with")
//                }
//                append(" ")
//                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)){
//                    pushStringAnnotation(tag = privacyText,privacyText)
//                    append(privacyText)
//                }
//                append(" And ")
//                withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)){
//                    pushStringAnnotation(tag = policyText,policyText)
//                    append(policyText)
//                }
            Checkbox(checked, onCheckedChange)

            Text("I Agree with")
            Spacer(Modifier.height(itemSpacing))
            TextButton(onClick = {}) {
                Text("Privacy and Policy")
            }
        }




        Spacer(Modifier.height(190.dp))


        Button(
            onClick = {
                //Toast.makeText(context,"Sign Up Clicked",Toast.LENGTH_SHORT).show()
            }, modifier = Modifier.fillMaxWidth()
        ) {

            Text("Sign Up")
        }
        Row(

            verticalAlignment = Alignment.CenterVertically,

            ) {
            Text("Already have an account?")
            TextButton(onClick = {
                Toast.makeText(context, "Sign In Clicked", Toast.LENGTH_SHORT).show()
            }) {
                Text("Sign In")
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DisplaySignScreen() {
    SignUpScreen()
}