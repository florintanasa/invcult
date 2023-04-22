# Inventariere culturi
## Instalare
***
Pentru a lucra la acest proiect va trebui, ca initial, să avem instalat:
+ IDE-ul IntelliJ Idea cu pluginul Cuba
+ un client pentru _**git**_

### Nota

Cu ajutorul clientului git vom clona proiectul utlizând comanda:

`git clone https://github.com/florintanasa/invcult.git`

Proiectul în urma clonării va fi importat în IntelliJ Idea.  

> Nota - Proiectul poate fi importat de către IntelliJ Idea direct din git folosind comanda:  
> File->New->Project from Vesrion Control...  
  
> Atenție:  Proiectul este configurat pentru PostgreSQL. Din meniul Cuba->Main data store settings-> puteți schimba credențialele la PostgresSQL conform cu serverul vostru sau puteți alege alt DBMS ca de exemplu HSQLDB 
> De asemenea, ecranul Harta face referire la o entitate ce este conecatată la un view in PostgresSQL, ce va trebui creat, dar harta din ecranul Localități este utilizabilă.

Pentru hartă am folosit componenta v-leaflet de la https://vaadin.com/directory/component/v-leaflet



# Crop inventory
## Installation
***
In order to work on this project, we will initially need to have installed:
+ The IntelliJ Idea IDE with the Cuba plugin
+ a client for _**git**_

### Note

With the help of the git client we will clone the project using the command:

`git clone https://github.com/florintanasa/invcult.git`

The project after cloning will be imported into IntelliJ Idea.

> Note - The project can be imported by IntelliJ Idea directly from git using the command:
> File->New->Project from Vesrion Control...
  
> Attention: The project is configured for PostgreSQL. From the menu Cuba->Main data store settings-> you can change the credentials to PostgresSQL according to your server or you can choose another DBMS such as HSQLDB
> Also the Map screen refers to an entity that is connected to a view in PostgresSQL, this need made manualy in PostgreSQL, but the map in the Locality screen is usable.

For the map I used the v-leaflet component from https://vaadin.com/directory/component/v-leaflet
