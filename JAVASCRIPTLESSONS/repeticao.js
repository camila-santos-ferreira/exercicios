// numero = 1
// while(numero <= 10){
//     console.log(numero)
//     numero++
// }



// numero = 0
// do {
//     console.log(numero++)
// } while (numero <=10)



// for(numero = 1; numero <=10; numero++) {
//     console.log(numero)
// }

frutas = ["Acerola", "Banana", "Caqui", "Damasco", "Embu"]
for(i = 0; i <= frutas.length; i++) {
    console.log(frutas[i])
}
i = 0
do{
    console.log(frutas[i])
    i++
} while (i < frutas.length)





numeros = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
soma = 0
for(i = 0; i < numeros.length; i++) {
    soma = soma + numeros[i]
}
media = soma/numeros.length
console.log(media)





nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]
comum = false;
for(i = 0; i <= nomesComuns.length; i++) {

    if("Camila" == nomesComuns[i]){
        comum = true;
    }
}
if(comum) {
    console.log("É, nome comum :P")
} else {
    console.log("Diferentão, hein? XD")
}
