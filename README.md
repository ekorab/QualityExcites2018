# QualityExcites2018
Repository contains base project which will be used during workshops "Best practices for creating Selenium tests using Cucumber".

# Environment setup
To be well prepared for the workshops there is need to setup environment in which we will be working. It's quite easy, but steps list might look a little bit scary. Don't worry, all will be described in details. In case of any problem you can email me - maciej.lorenc[at]gmail.com :) 
1. Install JDK
1. Install maven
1. Install docker
1. Install VNC viewer
1. Run selenium hub and node images
1. Install IntelliJ Idea
1. Import project from github
1. Add project as a maven project in IDE
1. Run sample test and check if it's working

#### Run selenium hub and node images
```
docker network create grid
docker run -d -p 4444:4444 --net grid --restart=always --name selenium-hub selenium/hub:3.12.0-cobalt
docker run -d -p 5900:5900 --net grid -e HUB_HOST=selenium-hub --shm-size 2g --restart=always --name selenium-node selenium/node-firefox-debug:3.12.0-cobalt
```