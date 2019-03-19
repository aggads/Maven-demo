pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/aggads/Maven-demo', branch: '/master*', credentialsId: '8b51296e-202d-4987-8653-109000d0fa13')
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}