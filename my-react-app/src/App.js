import React from "react";
import UserProfile from "./components/UserProfile";
import "./App.css";

function App() {
  return (
    <div className="App">
      <UserProfile
        name="Jane Doe"
        email="jane.doe@example.com"
        photoUrl="https://example.com/user-photo.jpg"
      />
    </div>
  );
}

export default App;
