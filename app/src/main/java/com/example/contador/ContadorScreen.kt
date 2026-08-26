package com.example.contador

import androidx.compose.ui.tooling.preview.Preview
import com.example.contador.ui.theme.ContadorTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContadorScreen() {



    var contador by rememberSaveable {
        mutableStateOf(0)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Contador")
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),

            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.spacedBy(
                24.dp,
                Alignment.CenterVertically
            )
        ) {

            Text(
                text = "Valor atual",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = contador.toString(),
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Row(
                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                Button(
                    onClick = {
                        contador++
                    },

                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Incrementar")
                }

                OutlinedButton(
                    onClick = {
                        contador--
                    },

                    enabled = contador > 0,

                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Decrementar")
                }
            }

            TextButton(
                onClick = {
                    contador = 0
                },

                enabled = contador != 0
            ) {
                Text(text = "Zerar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorScreenPreview() {
    ContadorTheme {
        ContadorScreen()
    }
}