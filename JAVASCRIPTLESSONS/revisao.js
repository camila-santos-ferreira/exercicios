

// let niveis = ["Muito abaixo do peso", "Abaixo do peso", "Peso normal", "Acima do peso", "Obesidade grau I", "Obesidade grau II", "Obesidade grau III"]


// let pessoas = ["Maria", "Pedro", "Mario"]
// let massas = [68, 99, 87]
// let alturas = [1.65, 1.96, 1.78]


// function calcularIMC(massa,altura) {
//     let imc = massa/(altura**2)
//     return imc
// }

// function verificarIMC(imc) {
//     let nivel = 0

//     if(imc < 17){
//         nivel = 0
//     } else if (imc < 18.5) {
//         nivel = 1
//     } else if (imc < 25) {
//         nivel = 2
//     } else if (imc < 30) {
//         nivel = 3
//     } else if (imc < 35) {
//         nivel = 4
//     } else if (imc < 40) {
//         nivel = 5
//     } else {
//         nivel = 6
//     }

//     return nivel
// }


// for(let indice = 0; indice < pessoas.length; indice++) {


// let pessoa = pessoas[indice]
// let massa = massas[indice]
// let altura = alturas[indice]

// let imc = calcularIMC(massa,altura)
// let nivel  = verificarIMC(imc)

// console.log("Nome: " + pessoa + " | " + "Peso: " + massa + " | " + "Altura: " + altura + " | " + "IMC: " + imc.toFixed(2) + " | " + "Nível: " + niveis[nivel])
// }


let colaboradores = ["Rhoger", "Cléverson", "Gleysberto", "Nádio", "Rosiméri", "Regislane", "Agripino", "Wellison"]
let idades = [69, 66, 58, 61, 60, 64, 59, 55]
let temposDeTrabalho = [31, 29, 30, 26, 25, 24, 26, 29]

function verificarAposentadoria(nome) {

    let colaborador = false
    let idade  = 0
    let tempoDeTrabalho = 0
    
    for(i = 0; i < colaboradores.length; i++){

        if(nome == colaboradores[i]){
            colaborador = true
            idade = idades[i]
            tempoDeTrabalho = temposDeTrabalho[i]
        }

    }

    if(colaborador){
        
    if(idade >= 65){
        console.log("Parabéns, já pode sair de férias eternas :)")
    } else if (tempoDeTrabalho >= 30) {
        console.log("Parabéns, já pode sair de férias eternas :)")
    } else if (idade >= 60 && tempoDeTrabalho >= 25){
        console.log("Parabéns, já pode sair de férias eternas :)")
    } else {
        console.log("Infelizmente para você, ainda falta um tempo :(")
    }
    
    } else {
    console.log("Colaborador inválido :|")
    }
}

verificarAposentadoria('Rosiméri')    // true (regra 3)
verificarAposentadoria('Agripino')    // false (falta 1 ano de idade para regra 3)
verificarAposentadoria('Rhoger')      // true (todas)
verificarAposentadoria('Hudnélson')   // false (colaborador inexistente)
verificarAposentadoria('Gleysberto')  // true (regra 2)
verificarAposentadoria('Regislane')   // false (falta 1 ano de idade para regra 1 e 1 de trabalho para regra 3)
verificarAposentadoria('Cléverson')   // true (regras 1 e 3)
verificarAposentadoria('Nádio')       // true (regra 3)
verificarAposentadoria('Wellison')    // false (falta 1 ano de trabalho para regra 2)
verificarAposentadoria('Florisberto') // false (colaborador inexistente)