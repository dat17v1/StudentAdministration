# StudentAdministration
Eksemplerne fra undervisningen i Spring MVC på 2. semester

<hr>

## Lav: Details, Update, Delete funktionalitet

````
    // READ
        @GetMapping("/details")
        public String details(@RequestParam("studentId") String studentId)
        {
            // Opgave:
            // overfør en student med studentid = parameteret.
            // til details.html og skriv al info on den studerende ud på siden
            System.out.println(studentId);
            return "details";
        }
````
````
        // UPDATE
        // LAV en update metode
    
    
        // DELETE
        // Lav en delete metode
````

## Løsningen til først opgave
_07-09-2017_
* Se i branch: ["firstassignmentsolution"](https://github.com/dat17v1/StudentAdministration/tree/firstassignmentsolution)
## Jeres første opgave
_05-09-2017_
* Lav et nyt projekt og kald det _"StudentAdministartion"_
* lav en StudentController, med en index metode der returnerer en liste af studerende til View´et
* i index View´et skal i loope gennem denne liste og skrive den ud i en html tabel.

Resultatet skulle gerne se nogenlunde sådan ud (- knapperne, som vi kommer til senere).

![Students](https://github.com/dat17v1/2_05_user_interface_iii/blob/master/snippets/Studentfront.png)



