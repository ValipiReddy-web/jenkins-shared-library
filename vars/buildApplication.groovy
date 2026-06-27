def call() {
    echo "Building Java Application..."

    sh '''
        mvn clean package
    '''
}
