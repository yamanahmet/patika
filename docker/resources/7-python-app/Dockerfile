FROM python:3.11.0rc2-slim
WORKDIR /server
COPY dependencies.txt .
RUN pip install -r dependencies.txt
COPY src/ .
CMD ["python", "./server.py"]