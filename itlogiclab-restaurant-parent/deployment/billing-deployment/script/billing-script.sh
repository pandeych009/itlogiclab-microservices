#! /bin/bash -e

mvn clean install -DskipTests=true

version=$1
echo 'Image will be create with version '$version

cd /Users/cpandey/dev/github/itlogiclab-microservices/itlogiclab-restaurant-parent/service/itlogiclab-restaurant-billing
docker build -f Dockerfile -t pandeych009/itlogiclab-restaurant-billing:$version .
docker push pandeych009/itlogiclab-restaurant-billing:${version}
echo "Docker build completed for itlogiclab-restaurant-billing project: build Image: itlogiclab-restaurant-billing:"$version