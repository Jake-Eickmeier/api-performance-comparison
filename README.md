# api-performance-comparison

A comparison of some core metrics for APIs built using different technologies

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