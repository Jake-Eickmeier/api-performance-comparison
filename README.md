# api-performance-comparison

A comparison of some core metrics for APIs built using different technologies

## How to run
`docker-compose up -d --build`
- You can leave out the -d flag if you don't care to run the services in detached mode
- You can leave out the --build flag if you don't need to rebuild the Docker images

With everything running, the given services will be exposed on the following ports:
- Prometheus: 9090
- Grafana: 3000
- cadvisor: 8080
- fastapi-application: 8000

## Tech stack
### Metrics
- Prometheus: 
    - Instrumenting services for basic performance metrics
    - Server for scraping and querying exported data from services and other technologies

- cadvisor:
    - Exposing container metrics from docker

### Dashboarding/visualization
- Grafana
    - Display time-series graphs for latency percentiles, resource usage, etc.

### Containerization
- Docker


- Docker-compose

### API
- FastAPI (Python)

- Spring web framework (Java)