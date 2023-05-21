#! /bin/bash -e

mvn clean install -DskipTests=true

version=$1
echo $1
echo 'Argument passed by the user $#'
echo 'All argument passed to  $*'
echo ''
echo $version

#if [ $# -eq 0];
#then
#  version = 3.0.1.1
#else
# echo "version supplied by the user $version"

echo 'Image will be create with version '$version

cd /Users/cpandey/dev/projects/Docker-Kube-Projects/itlogiclab-restaurant-parent/simple-service/itlogiclab-restaurant-order-kube
docker build -t pandeych009/itlogiclab-restaurant-order-kube:$version .
docker push pandeych009/itlogiclab-restaurant-order-kube:${version}
echo "Docker build completed for itlogiclab-restaurant-order-kube project: build Image: itlogiclab-restaurant-order-kube:"$version