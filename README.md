# itlogiclab-microservices
This application is a practice application. This is a multimodule project with the following modules
Order 
Billing
Payment 
Delivery
Please use Order or Billing application. 

## Installation
Download the project using the following command
```
git clone https://github.com/pandeych009/itlogiclab-microservices.git
```

Checkout the dev branch
```
git checkout dev
```

Change the directoy 
```
cd itlogiclab-microservices
```

Maven Build the project
```
mvn clean install -DskipTests=true

```
# Deployment

## Deployment using docker - Compose



## Deployment on Kubernetes

Start the docker daemon 

1. Unix 
```
systemctl docker start
```

2. Mac
```
systemctl docker start
```

3. Start the minikube cluster 
```
minikube start
```

4. Enable Add ons
```
minikube enable addons ingress
```

5. Deployment of Order application
```
kubectl apply -f ./deployment/order-deployment/mysql-deploy-definition.yaml 
kubectl apply -f ./deployment/order-deployment/order-deployment-definition.yaml
```

6. Validate the deployment
```
kubectl get all
```

## Running the application 
1. Application 
```
Steps for running the application is mention on the page at 
```
[itlogiclab Application pages](https://itlogiclab.com/2022/12/kubernetes-deployment-of-springboot-application-with-mysql/)

2. Ingress
``` 
Step for running the ingress is listed on 
```
[itlogiclab Ingress pages](https://itlogiclab.com/2023/05/ingress/)


3. Docker-Compose 

PLease check the .env file which is present in the current directory if the service. 
```
e.g. itlogiclab-restaurant-order have its own .env files
```
Update few variable values which is your system based. 

Execute the following command after traversing to project directory 
```
docker-compose -f docker-compose-order.yaml up -d
```
Check the installation 
```
docker ps 
```

Response look like this 
```
CONTAINER ID   IMAGE          COMMAND                  CREATED         STATUS         PORTS                                           NAMES
33f492a97e19   609fc5f31863   "java -jar /opt/app/…"   9 seconds ago   Up 7 seconds   0.0.0.0:20001->20001/tcp, :::20001->20001/tcp   order-web-app
897211293b98   56b1d76c9338   "/docker-entrypoint.…"   9 seconds ago   Up 8 seconds   0.0.0.0:3301->3306/tcp, :::3301->3306/tcp       order-percona-db
```

Test the application using curl 
```
http://localhost:20001/order/api/get
```

More Information on

[Itlogiclab Docker Pages](https://itlogiclab.com/2022/10/deployment-of-springboot-application-with-mysql-using-docker-compose/)




