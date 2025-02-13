import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import "./styles.css"; // Import your styles

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
  );

// Optional: Remove this if you are not using performance tracking
// import reportWebVitals from "./reportWebVitals";
// reportWebVitals();
