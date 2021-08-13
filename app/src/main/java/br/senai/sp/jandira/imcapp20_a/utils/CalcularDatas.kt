package br.senai.sp.jandira.imcapp20_a.utils

import android.util.Log
import java.time.LocalDate
import java.time.Period

fun obterDiferencaEntreDatasEmAnos(dataInicio: String) {
    var hoje: LocalDate = LocalDate.now()

    var ano = dataInicio.substring(0, 3).toInt()
    var mes = dataInicio.substring(5, 6).toInt()
    var dia = dataInicio.substring(8, 9).toInt()

    var nascimento = LocalDate.of(ano, mes, dia)

    var idade = Period.between(nascimento, hoje)
    Log.i("XPTO", idade.years.toString())
}

