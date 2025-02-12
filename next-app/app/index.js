import Head from 'next/head';

export default function Home() {
  return (
    <div>
      <Head>
        <title>Next.js Landing Page</title>
      </Head>
      <header>
        <h1>Welcome to Next.js App</h1>
      </header>
      <main>
        <section>
          <h2>Section 1</h2>
          <p>This is some placeholder text for section 1.</p>
        </section>
        <section>
          <h2>Section 2</h2>
          <p>This is some placeholder text for section 2.</p>
        </section>
      </main>
      <footer>
        <p>&copy; 2025 Next.js App</p>
      </footer>
    </div>
  );
}
