# i3Digit OS "SPRING BOOT BACK-END"
___

i3Digit OS is a powerful application designed to streamline various aspects of managing 3D printing and modeling services. It simplifies the process of handling materials, pricing, and database management, optimizing efficiency and accuracy.

### About i3Digit

At i3Digit, we specialize in 3D printing and modeling services, dealing with a vast array of materials essential for the printing process. With numerous filament types available, each with its unique price and weight, manually calculating costs becomes labor-intensive. i3Digit OS resolves this challenge by providing a suite of user-friendly functions, significantly reducing time spent on routine calculations. By storing all material information in a MySQL database, users can effortlessly access data without the need for repetitive manual inputs of material details.

**Key Functions & Roadmap**

i3Digit OS offers three primary functions which is divided into development phases:

- **PHASE 1 - PRESENT VERSION** - Data Management: Easily write, read, and delete filament data within the database. Simplify the handling of various materials used in 3D printing.

- PHASE 2 - Price Calculation: Seamlessly calculate the end price of 3D printed products based on user selections. Efficiently manage cost estimations and optimize pricing strategies.

- PHASE 3 - Printer Integration: The application features a dedicated Printer tab, aiming to streamline the integration of different 3D printers. Each printer can be configured individually, catering to their unique functionalities.

### Back-End Overview

i3Digit OS uses Java Spring Boot back-end part which uses MySQL for database to store and read the data. Front-end is done on Angular Framework and whole communication will be done through REST application programming interface.

- Spring boot back-end is developed on Java 17 language version.
- Version 8 of MySQL is used.

### Setting up back-end for use

1. Download springBoot branch from GitHub (Code -> Download ZIP).
2. Create a new empty folder where you want to locate this application back-end files.
3. Copy all files from downloaded ZIP file to your empty project folder.
4. Look for application.yml file in .../src/main/resources folder and enter your correct MySQL username and password. 
5. Check if MySQL service is operational - *If MySQL service is stopped then Spring Boot application won't start and gives an error!*
6. Run Spring app through main function in OperatingSystemApplication.
7. Please continue with Angular front-end setup to start using web application: https://github.com/LDispagne/I3Digit_OS_Angular_FE

**Note** - Application will create new table "filamentdb" by default if such table don't exist 
in MySQL database already. If "filamentdb" table is already existing then all data will be taken 
from there which means previous table will be not overwritten. <br>
- *To clear and reset database user has to drop table in MySQL Workbench.*

#### Dependencies that i3Digit OS Spring will use

- Spring Web
- Spring Data JPA
- MySQL Driver
- Validation
- Lombok

<br>

*--Phase 1--* <br>
*Version 0.2.4* <br>
*20.01.2024*
___

## Changelog

<br>

***Version 0.2.4***
- Added functionality to change status of filament
---
***Version 0.2.3***
- Reworked Spring Boot Back-End readme instructions 
---
***Version 0.2.2***
- Removed hardcoded examples of filaments
---
***Version 0.2.1***
- New database will be created only if table does not exist in database. If
"filamentdb" table already exists then data will be taken from that table.
---
***Version 0.2.0***

**Added core functions:**
 1. Read data from database
 2. Write data to database
 3. Delete data from database

- Connectivity with Angular framework (Front-End)



