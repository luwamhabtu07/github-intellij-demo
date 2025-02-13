import { render, screen } from "@testing-library/react";
import UserProfile from "../components/UserProfile";

test("renders the user profile correctly", () => {
  render(
    <UserProfile
      name="Jane Doe"
      email="jane.doe@example.com"
      photoUrl="https://example.com/user-photo.jpg"
    />
  );

  expect(screen.getByText(/User Profile/i)).toBeInTheDocument();
  expect(screen.getByText(/Jane Doe/i)).toBeInTheDocument();
  expect(screen.getByText(/jane.doe@example.com/i)).toBeInTheDocument();
});

test("renders different user data", () => {
  render(
    <UserProfile
      name="John Smith"
      email="john.smith@example.com"
      photoUrl="https://example.com/john.jpg"
    />
  );

  expect(screen.getByText(/John Smith/i)).toBeInTheDocument();
  expect(screen.getByText(/john.smith@example.com/i)).toBeInTheDocument();
});

test("handles missing photo URL gracefully", () => {
  render(<UserProfile name="Test User" email="test@example.com" />);
  expect(screen.getByAltText("User Photo")).toHaveAttribute(
    "src",
    expect.any(String)
  );
});
