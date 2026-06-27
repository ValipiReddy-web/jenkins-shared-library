def call() {

    def imageName = "nginx:latest"
    def containerName = "nginx-container"
    def hostPort = "8080"
    def containerPort = "80"

    sh """
        echo "Removing existing container..."
        docker rm -f ${containerName} || true

        echo "Pulling Docker image..."
        docker pull ${imageName}

        echo "Starting Nginx container..."
        docker run -d \
            --name ${containerName} \
            -p ${hostPort}:${containerPort} \
            ${imageName}

        echo "Container Details:"
        docker ps
    """
}
