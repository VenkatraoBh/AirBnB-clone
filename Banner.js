import React, { useState } from "react";
import "./Banner.css";
import { Button } from "@mui/material";
import Search from "./Search";
import { useHistory } from "react-router-dom";

function Banner() {
  const [showSearch, setShowSerch] = useState(false);
  const history = useHistory();

  return (
    <div className="banner">
      {showSearch && <Search />}
      <div
        onClick={() => {
          setShowSerch(!showSearch);
        }}
        className="banner__search"
      >
        <Button className="banner__searchButton" variant="outlined">
          {showSearch ? "Hide" : "Search Dates"}
        </Button>
      </div>
      <div className="banner__info">
        <h1>Get out and stretch your immagination</h1>
        <h5>
          Plan a different kind of getaway to uncover the hidden gems near you.
        </h5>
        <Button
          onClick={() => {
            history.push("/search");
          }}
          variant="contained"
        >
          Explore Nearby
        </Button>
      </div>
    </div>
  );
}

export default Banner;
