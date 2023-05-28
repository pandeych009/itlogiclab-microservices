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
Steps for running the application is mention on the page at [itlogiclab pages](https://itlogiclab.com/2022/12/kubernetes-deployment-of-springboot-application-with-mysql/)

