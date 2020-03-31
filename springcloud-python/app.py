from flask import Flask, Response, request
import json

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello World!'


@app.route('/health')
def health():
    result = {'status': 'UP'}
    return Response(json.dumps(result), mimetype='application/json')


@app.route("/hi", methods=["GET"])
def hi():
    data = request.args
    name = request.args['name']
    return Response(json.dumps({'status': True, 'data': 'hi ' + name + ' i`m python'}), mimetype='application/json')


if __name__ == '__main__':
    app.run(port=5001)
