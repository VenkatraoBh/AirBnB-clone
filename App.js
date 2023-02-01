import "./App.css";
import Footer from "./Footer";
import Header from "./Header";
import Home from "./Home";
import { BrowserRouter as Router } from "react-router-dom";
import { Route } from "react-router-dom";
import { Switch } from "react-router-dom";

import SearchPage from "./SearchPage";

function App() {
  return (
    <div className="App">
      <Router>
        <Header />
        <Switch>
          <Route path="/search">
            <SearchPage />
          </Route>
          <Route path="/">
            <Home />
          </Route>
        </Switch>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
