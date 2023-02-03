# liveweatherapi
 Spring Boot based application that pulls the live weather data for a given city and visualizes it.

****
<h1>Dependencies</h1>

* Oracle JDK 17
* Apache Maven
* NodeJS 

<h1>Installation</h1>

First you need to run the following command.
```
git clone --recursive https://github.com/yasemindirek/LiveWeatherApp.git
```

<h1>Run</h1>

First you need to navigate to the project directory which is `LiveWeatherApp` using the command prompt. You need to run the following command to compile the Spring Boot application.

```
mvn spring-boot:run
```

After the project is successfully compiled as in the image:

![image](https://user-images.githubusercontent.com/92397922/216609002-a118e370-8c54-4c71-abda-9583e1d0f3e6.png)

Next, you need to navigate to the `weather-app` directory within `LiveWeatherApp`.

You need to run the following comand before starting the application.

```
npm install
```
After installation, run the following command to start application.

```
npm start
```
You need to see this as a result:

![image](https://user-images.githubusercontent.com/92397922/216610585-958ec76b-5bac-4da2-abfd-25fee89e1113.png)

The following page is going to open automatically:

![image](https://user-images.githubusercontent.com/92397922/216611390-bf9f3d0f-5966-4a12-83d1-f1f5626d8456.png)

You need to write the entry in City/Country format. The image below is the result for the Ankara/Turkey example: 

![image](https://user-images.githubusercontent.com/92397922/216612246-655d4e12-6235-4435-a06a-adabf1559bf8.png)





