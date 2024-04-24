import 'package:flutter/material.dart';

void main() {
  runApp(MyApp(
    title: 'Flutter Demo',

    home: MyHomePage(title: 'Flutter Demo Home Page'),

    // home: MySecondPage(title: 'Flutter Demo Second Page'),

    // home: MyThirdPage(title: 'Flutter Demo Third Page'),
  ));
}

class MyApp extends StatelessWidget {
  final String title;

  const MyApp({super.key, this.title});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: title,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: title, key: null,),
    );
  }
}

class MyHomePage extends StatefulWidget {
  final String title;

  const MyHomePage({required Key key, required this.title}) : super(key: key);

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'You have pushed the button this many times:',
            ),
            Text(
              '$_counter',
              style: Theme.of(context).textTheme.headline4,
            ),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: Icon(Icons.add),
      ),
    );
  }
}

// class MySecondPage extends StatelessWidget {
//   final String title;

//   const MySecondPage({Key key, this.title}) : super(key: key);

//   @override  
//   Widget build(BuildContext context) {